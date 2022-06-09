package com.revature.data;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.revature.models.Pokemon;
import com.revature.models.PokemonMoves;

@Repository
public interface UserPokemon{

	Optional<Pokemon> findByUserName(String username);
	
	public List<Pokemon> findPokemonById(String username, int id);
	public List<Pokemon> findPokemonbyName(String username, String name);
	public List<PokemonMoves> findMovesById(String username, int id);
	public List<PokemonMoves> findMovesbyName(String username, String name);
	
	
	public void deleteById(String username, int id);
	public void deleteByName(String username, String name);
	
	
	
}
