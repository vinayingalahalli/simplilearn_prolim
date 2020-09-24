package com.api.superhero.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@ToString
public class SuperHero {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String comic;
	private int age;
	private String power;
}
