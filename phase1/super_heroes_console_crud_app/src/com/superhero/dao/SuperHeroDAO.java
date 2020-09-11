package com.superhero.dao;

import java.util.List;

import com.superhero.exception.SuperHeroException;
import com.superhero.model.SuperHero;

public interface SuperHeroDAO {
	public SuperHero createSuperHero(SuperHero superHero) throws SuperHeroException;
	public SuperHero updateSuperHero(int id, int age) throws SuperHeroException;
	public void deleteSuperHero(int id) throws SuperHeroException;
	public SuperHero getSuperHeroById(int id) throws SuperHeroException;
	
	public List<SuperHero> getAllSuperHeros() throws SuperHeroException;
	public List<SuperHero> getSuperHerosByAge(int age) throws SuperHeroException;
	public List<SuperHero> getSuperHerosByComicCategory(String comicCategory) throws SuperHeroException;
	public List<SuperHero> getSuperHerosByGender(String gender) throws SuperHeroException;
}
