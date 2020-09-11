package com.superhero.main;

import java.util.List;
import java.util.Scanner;

import com.superhero.exception.SuperHeroException;
import com.superhero.model.SuperHero;
import com.superhero.service.SuperHeroService;
import com.superhero.service.impl.SuperHeroServiceImpl;

public class SuperHeroMain {

	public static void main(String[] args) {
		System.out.println("Welcome to SuperHeros App V1.0");
		System.out.println("------------------------------------");
		int ch = 0;
		Scanner scanner = new Scanner(System.in);
		SuperHeroService service = new SuperHeroServiceImpl();
		do {
			System.out.println("\nSuperHero Menu");
			System.out.println("===================");
			System.out.println("1)Create SuperHero");
			System.out.println("2)Update SuperHero");
			System.out.println("3)Search SuperHero By Id");
			System.out.println("4)Delete SuperHero");
			System.out.println("5)List All SuperHeros");
			System.out.println("6)Search SuperHeros By Age");
			System.out.println("7)Search SuperHeros By Gender");
			System.out.println("8)Search SuperHeros By ComicCategory");
			System.out.println("9)EXITTTTTT");
			System.out.println("Please Enter your appropriate choice(1-9)");
			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1:
				System.out.println("Enter SuperHero Details Below.....");
				SuperHero sh=new SuperHero();
				System.out.println("Enter SuperHero's Name");
				sh.setName(scanner.nextLine());
				System.out.println("Enter SuperHero's Age");
				sh.setAge(Integer.parseInt(scanner.nextLine()));
				System.out.println("Enter SuperHero's Gender");
				sh.setGender(scanner.nextLine());
				System.out.println("Enter SuperHero's ComicCategory");
				sh.setComicCategory(scanner.nextLine());
				try {
					sh=service.createSuperHero(sh);
					System.out.println("SuperHero created with details "+sh);
				} catch (SuperHeroException e1) {
					System.out.println(e1.getMessage());
				}
				break;
			case 2:System.out.println("Thanks for your interest, this option is under construction");

				break;
			case 3:System.out.println("Please Enter Superhero ID for Superhero's details");
					int id=Integer.parseInt(scanner.nextLine());
				try {
					SuperHero sup=service.getSuperHeroById(id);
					System.out.println("Details of superhero with id "+id+" is : ");
					System.out.println(sup);
				} catch (SuperHeroException e1) {
					System.out.println(e1.getMessage());
				}

				break;
			case 4:System.out.println("Please Enter Superhero ID to be deleted");
			    id=Integer.parseInt(scanner.nextLine());
				try {
					service.deleteSuperHero(id);
					System.out.println("Superhero with id = "+id+" deleted successfullyyyy");
				} catch (SuperHeroException e1) {
					System.out.println(e1.getMessage());
				}
				break;
			case 5:try {
					List<SuperHero> superHerosList=service.getAllSuperHeros();
					if(superHerosList!=null && superHerosList.size()>0) {
						System.out.println("We found "+superHerosList.size()+" superheros... Here we go with their details");
						for(SuperHero s:superHerosList) {
							System.out.println(s);
						}
					}
				} catch (SuperHeroException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 6:System.out.println("Please Enter Age to retrive all Superheros of that age");
			int age=Integer.parseInt(scanner.nextLine());
			try {
				List<SuperHero> superHerosList=service.getSuperHerosByAge(age);
				if(superHerosList!=null && superHerosList.size()>0) {
					System.out.println("We found "+superHerosList.size()+" superheros... of age -> "+age+" Here we go with their details");
					for(SuperHero s:superHerosList) {
						System.out.println(s);
					}
				}
			} catch (SuperHeroException e) {
				System.out.println(e.getMessage());
			}
				break;
			case 7:System.out.println("Thanks for your interest, this option is under construction");

				break;
			case 8:System.out.println("Thanks for your interest, this option is under construction");

				break;
			case 9: System.out.println("Thanks for using our SuperHero APP V1.0.. We would like to see you soon.....");

				break;
			default:
				System.out.println("Entered choice is invalid it should be numbers between 1-9 only");
				break;
			}

		} while (ch != 9);
	}

}
