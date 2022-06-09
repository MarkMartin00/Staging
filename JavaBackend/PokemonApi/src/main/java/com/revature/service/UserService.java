package com.revature.service;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Pokemon;

@Service
public class UserService {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	public Pokemon pokeMon;
	
	@Transactional(readOnly=true)
	public Set<Pokemon> findAll() {
		pokeMon.getPokeId(1);
		pokeMon.getName();
		pokeMon.getType1();
		pokeMon.getType2();
		pokeMon.getMoves();
		pokeMon.getStats();
		pokeMon.getSpritesBackDefault();
		pokeMon.getSpritesBackShiny();
		pokeMon.getSpritesFrontDefault();
		pokeMon.getSpritesFrontShiny();
		
		return null;
	}
	
	
	
	
	
	
	
}
