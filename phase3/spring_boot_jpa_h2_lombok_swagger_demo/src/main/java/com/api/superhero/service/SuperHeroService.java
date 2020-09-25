package com.api.superhero.service;

import java.util.List;

import com.api.superhero.exceptionHandler.BusinessException;
import com.api.superhero.model.SuperHero;

public interface SuperHeroService {

	public SuperHero createSuperHero(SuperHero superHero);
	public SuperHero updateSuperHero(SuperHero superHero);
	public SuperHero getSuperHeroById(int id) throws BusinessException;
	public void deleteSuperHeroById(int id);
	public List<SuperHero> getAllSuperHeros();
	public List<SuperHero> getAllSuperHerosByAge(int age);
	public List<SuperHero> getAllSuperHerosByName(String name);
	public List<SuperHero> getAllSuperHerosByComic(String comic);
	public List<SuperHero> getAllSuperHerosByPower(String power);
}
