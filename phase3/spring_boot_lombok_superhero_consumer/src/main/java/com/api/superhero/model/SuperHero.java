package com.api.superhero.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@ToString
public class SuperHero {

	
	private int id;
	private String name;
	private String comic;
	private int age;
	private String power;
	
//	@Column(name = "superHeroContact",length = 10,unique = true)
//	private long contact;
//	
//	@Temporal(TemporalType.DATE)
//	private Date dob;
//	
//	@OneToOne
//	private Comic comic:
}
