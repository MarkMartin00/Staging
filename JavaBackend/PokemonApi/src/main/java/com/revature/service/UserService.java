package com.revature.service;

import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.revature.models.Pokemon;
import com.revature.models.PokemonMoves;

@Service
public class UserService {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	private PokemonMovesRepository pokemonMovesRespository;
	public UserService(PokemonMovesRepository pokemonMovesRespository) {
		this.pokemonMovesRespository = pokemonMovesRespository;
	}
	
	
	private PokemonRepository pokemonRepository;
	public UserService(PokemonRepository pokemonRepository) {
		this.pokemonRepository = pokemonRepository;
	}
	
	public Iterable<Pokemon> list() {
		return pokemonRepository.findAll();
	}
	
	public Pokemon save(Pokemon pokemon) {
		return pokemonRepository.save(pokemon);
	}
	
	public Iterable<Pokemon> list(List<Pokemon> pokemon) {
		return pokemonRepository.save(pokemon);
	}
	
	
	
	
	
	
	
}
