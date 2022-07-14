package com.revature.models;

import java.util.Objects;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data @AllArgsConstructor
@Entity
public class Pokemon {

	
	private final long pokeId;
	private final String name;
	private final String type1;
	private final String type2;
	private final String moves;
	private final String stats;
	private final String spritesFrontDefault;
	private final String spritesBackDefault;
	private final String spritesFrontShiny;
	private final String spritesBackShiny;
	
	//Constructor -------------------------------------------------------------------------------------------
	public Pokemon(long pokeId, String name, String type1, String type2, String moves,
					String stats, String spritesFrontDefault, String spritesBackDefault,
					String spritesFrontShiny, String spritesBackShiny) {
		this.pokeId = pokeId;
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.moves = moves;
		this.stats = stats;
		this.spritesFrontDefault = spritesFrontDefault;
		this.spritesBackDefault = spritesBackDefault;
		this.spritesFrontShiny = spritesFrontShiny;
		this.spritesBackShiny = spritesBackShiny;
	}

	//toString method -------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Pokemons [pokeId=" + pokeId + ", name=" + name + ", type1=" + type1 + ", type2=" + type2 + ", moves="
				+ moves + ", stats=" + stats + ", spritesFrontDefault=" + spritesFrontDefault + ", spritesBackDefault="
				+ spritesBackDefault + ", spritesFrontShiny=" + spritesFrontShiny + ", spritesBackShiny="
				+ spritesBackShiny + "]";
	}

	//Getters and Setters -------------------------------------------------------------------------------------------
	public long getPokeId(int i) {
		return pokeId;
	}
	public String getName() {
		return name;
	}
	public String getType1() {
		return type1;
	}
	public String getType2() {
		return type2;
	}
	public String getMoves() {
		return moves;
	}
	public String getStats() {
		return stats;
	}
	public String getSpritesFrontDefault() {
		return spritesFrontDefault;
	}
	public String getSpritesBackDefault() {
		return spritesBackDefault;
	}
	public String getSpritesFrontShiny() {
		return spritesFrontShiny;
	}
	public String getSpritesBackShiny() {
		return spritesBackShiny;
	}
	
	//Hash code and Equals -------------------------------------------------------------------------------------------
	@Override
	public int hashCode() {
		return Objects.hash(moves, name, pokeId, spritesBackDefault, spritesBackShiny, spritesFrontDefault,
				spritesFrontShiny, stats, type1, type2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(moves, other.moves) && Objects.equals(name, other.name) && pokeId == other.pokeId
				&& Objects.equals(spritesBackDefault, other.spritesBackDefault)
				&& Objects.equals(spritesBackShiny, other.spritesBackShiny)
				&& Objects.equals(spritesFrontDefault, other.spritesFrontDefault)
				&& Objects.equals(spritesFrontShiny, other.spritesFrontShiny) && Objects.equals(stats, other.stats)
				&& Objects.equals(type1, other.type1) && Objects.equals(type2, other.type2);
	}
}
