package com.api.superhero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.superhero.model.SuperHero;

@Repository
public interface SuperHeroRepository extends JpaRepository<SuperHero, Integer> {
	
	public List<SuperHero> findByAge(int age);
	public List<SuperHero> findByComic(String comic);

}
