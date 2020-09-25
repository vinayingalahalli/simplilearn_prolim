package com.api.superhero.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.superhero.exceptionHandler.BusinessException;
import com.api.superhero.model.SuperHero;
import com.api.superhero.repository.SuperHeroRepository;
import com.api.superhero.service.SuperHeroService;

@Service
public class SuperHeroServiceImpl implements SuperHeroService{

	@Autowired
	private SuperHeroRepository repository;
	
	@Override
	public SuperHero createSuperHero(SuperHero superHero) {
		
		return repository.save(superHero);
	}

	@Override
	public SuperHero updateSuperHero(SuperHero superHero) {
		return repository.save(superHero);
	}

	@Override
	public SuperHero getSuperHeroById(int id) throws BusinessException {
		SuperHero superHero=null;
		try {
			if(id<=0) {
				throw new BusinessException("Id cannot be zero or negative");
			}
		superHero=repository.findById(id).get();
		}catch(NoSuchElementException e) {
			throw new BusinessException("No SuperHero found with id = "+id);
		}
		return superHero;
	}

	@Override
	public void deleteSuperHeroById(int id) {
		repository.deleteById(id);
	}

	@Override
	public List<SuperHero> getAllSuperHeros() {
		
		return repository.findAll();
	}

	@Override
	public List<SuperHero> getAllSuperHerosByAge(int age) {
		return repository.findByAge(age);
	}

	@Override
	public List<SuperHero> getAllSuperHerosByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SuperHero> getAllSuperHerosByComic(String comic) {
		return repository.findByComic(comic);
	}

	@Override
	public List<SuperHero> getAllSuperHerosByPower(String power) {
		// TODO Auto-generated method stub
		return null;
	}

}
