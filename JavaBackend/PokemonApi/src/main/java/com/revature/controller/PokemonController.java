package com.revature.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/Pokemon")
	public Pokemon pokemon(@RequestParam(value = "name", defaultValue = "World") String name) {
		//this is not correct and needs to be corrected.
		return new Pokemon(0, name, name, name, name, name, name, name, name, name);
	}
	
	
	
}
