package com.revature.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Pokemon;

@RestController
public class PokemonController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong(); //setting id
	
	@GetMapping("/pokemon")
	public Pokemon pokemon(@RequestParam(value = "name", defaultValue = "World") String name) {
		return null;
		
		
		//this is not correct and needs to be corrected.
	
//		return new Pokemon(counter.incrementAndGet(),String.format(template, name), 
//				pokeId, type1, type2, moves, stats, spritesFrontDefault, spritesBackDefault,
//				spritesFrontShiny, spritesBackShiny);
	}
	
}
