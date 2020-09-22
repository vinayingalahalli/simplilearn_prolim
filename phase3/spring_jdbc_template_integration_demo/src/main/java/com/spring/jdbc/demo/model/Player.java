package com.spring.jdbc.demo.model;

public class Player {

	private int id;
	private String name;
	private int age;
	private String teamName;
	
	public Player() {
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

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Player(int id, String name, int age, String teamName) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", teamName=" + teamName + "]";
	}
	
	
}
