package com.superhero.model;

public class SuperHero {

	private int id;
	private String name;
	private int age;
	private String comicCategory;
	private String gender;
	
	public SuperHero() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getComicCategory() {
		return comicCategory;
	}

	public void setComicCategory(String comicCategory) {
		this.comicCategory = comicCategory;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "SuperHero [id=" + id + ", name=" + name + ", age=" + age + ", comicCategory=" + comicCategory
				+ ", gender=" + gender + "]";
	}

	
	
	
}
