package com.superhero.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.superhero.dao.SuperHeroDAO;
import com.superhero.exception.SuperHeroException;
import com.superhero.model.SuperHero;

public class SuperHeroDAOImpl implements SuperHeroDAO {

	private static Map<Integer, SuperHero> superHeroMap = new HashMap<>();
	private static int count;

	@Override
	public SuperHero createSuperHero(SuperHero superHero) throws SuperHeroException {
		superHero.setId(++count);
		superHeroMap.put(superHero.getId(), superHero);
		return superHero;
	}

	@Override
	public SuperHero updateSuperHero(int id, int age) throws SuperHeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSuperHero(int id) throws SuperHeroException {
		if (superHeroMap.containsKey(id)) {
			superHeroMap.remove(id);
		} else {
			throw new SuperHeroException("Entered Id " + id + " doesnt exist");
		}

	}

	@Override
	public SuperHero getSuperHeroById(int id) throws SuperHeroException {
		if (superHeroMap.containsKey(id)) {
			return superHeroMap.get(id);
		} else {
			throw new SuperHeroException("Entered Id " + id + " doesnt exist");
		}
	}

	@Override
	public List<SuperHero> getAllSuperHeros() throws SuperHeroException {

		if (superHeroMap.size() == 0) {
			throw new SuperHeroException("No superHeros as of now.. Please create one");
		}
		return new ArrayList<>(superHeroMap.values());
	}

	@Override
	public List<SuperHero> getSuperHerosByAge(int age) throws SuperHeroException {
		List<SuperHero> superHeroList = superHeroMap.values().stream().filter(s -> s.getAge() == age)
				.collect(Collectors.toList());
		if(superHeroList.size()==0) {
			throw new SuperHeroException("No SuperHero found with age "+age);
		}
		return superHeroList;
	}

	@Override
	public List<SuperHero> getSuperHerosByComicCategory(String comicCategory) throws SuperHeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SuperHero> getSuperHerosByGender(String gender) throws SuperHeroException {
		// TODO Auto-generated method stub
		return null;
	}

}
