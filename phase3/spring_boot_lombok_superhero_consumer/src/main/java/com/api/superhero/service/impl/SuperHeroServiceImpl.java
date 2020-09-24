package com.api.superhero.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.superhero.model.SuperHero;
import com.api.superhero.service.SuperHeroService;

@Service
public class SuperHeroServiceImpl implements SuperHeroService{

	private String crudUrl="http://localhost:2000/superHero/";
	private String searchUrl="http://localhost:2000/superHeros/";
	
	/*
	 * To consume a REST APi in the backend you have
	 * 1)RestTemplate
	 * 2)Open Feign Client
	 * 3)For Testing(In Junit & Mockito) you have TestRestTemplate API
	 */
	
	private RestTemplate template=new RestTemplate();
	
	@Override
	public SuperHero createSuperHero(SuperHero superHero) {
		
		return template.postForObject(crudUrl, superHero, SuperHero.class);
	}

	@Override
	public SuperHero updateSuperHero(SuperHero superHero) {
		template.put(crudUrl, superHero);
		return superHero;
	}

	@Override
	public SuperHero getSuperHeroById(int id) {
		ResponseEntity<SuperHero> res=template.exchange(crudUrl+id, HttpMethod.GET,null,SuperHero.class);
		return res.getBody();
	}

	@Override
	public void deleteSuperHeroById(int id) {
		template.delete(crudUrl+id);
	}

	@Override
	public List<SuperHero> getAllSuperHeros() {
		ResponseEntity<List<SuperHero>> res=template.exchange(searchUrl, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<SuperHero>>() {
				});
		return res.getBody();
	}

	@Override
	public List<SuperHero> getAllSuperHerosByAge(int age) {
		ResponseEntity<List<SuperHero>> res=template.exchange(searchUrl+"age/"+age, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<SuperHero>>() {
				});
		return res.getBody();
	}

	@Override
	public List<SuperHero> getAllSuperHerosByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SuperHero> getAllSuperHerosByComic(String comic) {
		ResponseEntity<List<SuperHero>> res=template.exchange(searchUrl+"comic/"+comic, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<SuperHero>>() {
				});
		return res.getBody();
	}

	@Override
	public List<SuperHero> getAllSuperHerosByPower(String power) {
		// TODO Auto-generated method stub
		return null;
	}

}
