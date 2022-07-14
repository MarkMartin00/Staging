package com.revature.service;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import com.revature.models.Pokemon;

public interface PokemonRepository extends CrudRepository<Pokemon, Id>{

	

}