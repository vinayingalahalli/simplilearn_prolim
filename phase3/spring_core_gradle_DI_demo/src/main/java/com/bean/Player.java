package com.bean;

import java.util.List;

public class Player {

	private int id;
	private String name;
	private int age;
	private Address residence;
	private List<Team> teamsList;
	
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

	public Player(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public Address getResidence() {
		return residence;
	}

	public void setResidence(Address residence) {
		this.residence = residence;
	}

	public List<Team> getTeamsList() {
		return teamsList;
	}

	public void setTeamsList(List<Team> teamsList) {
		this.teamsList = teamsList;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", residence=" + residence + ", teamsList="
				+ teamsList + "]";
	}
	
	
}
