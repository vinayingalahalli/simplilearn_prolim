package com.superhero.service.impl;

import java.util.List;

import com.superhero.dao.SuperHeroDAO;
import com.superhero.dao.impl.SuperHeroDAOImpl;
import com.superhero.exception.SuperHeroException;
import com.superhero.model.SuperHero;
import com.superhero.service.SuperHeroService;

public class SuperHeroServiceImpl implements SuperHeroService {
	
	private SuperHeroDAO dao=new SuperHeroDAOImpl();

	@Override
	public SuperHero createSuperHero(SuperHero superHero) throws SuperHeroException {
		if(!isValidName(superHero.getName())) {
			throw new SuperHeroException("Entered name "+superHero.getName()+" is invalid");
		}else if(!isValidAge(superHero.getAge())) {
			throw new SuperHeroException("Entered age "+superHero.getAge()+" is invalid");
		}else if(!isValidGender(superHero.getGender())) {
			throw new SuperHeroException("Entered gender "+superHero.getGender()+" is invalid");
		}
		return dao.createSuperHero(superHero);
	}
	
	private boolean isValidName(String name) {
		boolean b=false;
		if(name.trim().matches("[a-zA-Z ]{3,20}")) {
			b=true;
		}
		return b;
	}
	
	private boolean isValidGender(String gender) {
		boolean b=false;
		if(gender.matches("[mMfF]{1}")) {
			b=true;
		}
		return b;
	}
	private boolean isValidAge(int age) {
		boolean b=false;
		if(age>15  && age <5000) {
			b=true;
		}
		return b;
	}
	private boolean isValidId(int id) {
		boolean b=false;
		if(id>0 && id <1000) {
			b=true;
		}
		return b;
	}
	@Override
	public SuperHero updateSuperHero(int id, int age) throws SuperHeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSuperHero(int id) throws SuperHeroException {
		if(!isValidId(id)) {
			throw new SuperHeroException("Invalid ID -> "+id);
		}else {
			dao.deleteSuperHero(id);
		}
		
	}

	@Override
	public SuperHero getSuperHeroById(int id) throws SuperHeroException {
		if(!isValidId(id)) {
			throw new SuperHeroException("Invalid ID -> "+id);
		}else {
			return dao.getSuperHeroById(id);
		}
	}

	@Override
	public List<SuperHero> getAllSuperHeros() throws SuperHeroException {
		
		return dao.getAllSuperHeros();
	}

	@Override
	public List<SuperHero> getSuperHerosByAge(int age) throws SuperHeroException {
		if(!isValidAge(age)) {
			throw new SuperHeroException("Invalid Age -> "+age);
		}else {
			return dao.getSuperHerosByAge(age);
		}
	}

	@Override
	public List<SuperHero> getSuperHerosByComicCategory(String comicCategory) throws SuperHeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SuperHero> getSuperHerosByGender(String gender) throws SuperHeroException {
		// TODO Auto-generated method stub
		return null;
	}

}
