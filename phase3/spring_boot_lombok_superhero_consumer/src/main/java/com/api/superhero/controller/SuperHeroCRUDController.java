package com.api.superhero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.superhero.model.SuperHero;
import com.api.superhero.service.SuperHeroService;

@RestController
public class SuperHeroCRUDController {

	@Autowired
	private SuperHeroService service;
	
	@PostMapping("/superHero")
	public SuperHero createSuperHero(@RequestBody SuperHero superHero) {
		
		return service.createSuperHero(superHero);
	}

	@PutMapping("/superHero")
	public SuperHero updateSuperHero(@RequestBody SuperHero superHero) {
		
		return service.updateSuperHero(superHero);
	}

	@GetMapping("/superHero/{id}")
	public SuperHero getSuperHeroById(@PathVariable int id) {
		
		return service.getSuperHeroById(id);
	}

	@DeleteMapping("/superHero/{id}")
	public void deleteSuperHeroById(@PathVariable int id) {
		service.deleteSuperHeroById(id);
		
	}
}
