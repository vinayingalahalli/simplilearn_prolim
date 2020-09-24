package com.api.superhero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.superhero.model.SuperHero;
import com.api.superhero.service.SuperHeroService;

@RestController
public class SuperHeroSearchController {
	@Autowired
	private SuperHeroService service;

	@GetMapping("/superHeros")
	public List<SuperHero> getAllSuperHeros() {
		
		return service.getAllSuperHeros();
	}

	@GetMapping("/superHeros/age/{age}")
	public List<SuperHero> getAllSuperHerosByAge(@PathVariable int age) {
		
		return service.getAllSuperHerosByAge(age);
	}

	public List<SuperHero> getAllSuperHerosByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/superHeros/comic/{comic}")
	public List<SuperHero> getAllSuperHerosByComic(@PathVariable String comic) {
		
		return service.getAllSuperHerosByComic(comic);
	}

	public List<SuperHero> getAllSuperHerosByPower(String power) {
		// TODO Auto-generated method stub
		return null;
	}
}
