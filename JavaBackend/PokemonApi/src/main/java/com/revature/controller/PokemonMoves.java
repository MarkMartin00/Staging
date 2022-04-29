package com.revature.controller;

import java.util.Objects;

public class PokemonMoves {

	private final String move;
	private final String accuracy;
	private final String type;
	private final int power;
	private final int ppNumber;
	private final int priority; 
	private final String target;
	private final float effectChance;
	private final String effect;
	private final String shortEffect;
	
	//Constructor ------------------------------------------------------------------------------------------------------
	public PokemonMoves(String move, String accuracy, String type, int power, int ppNumber, int priority, String target,
			float effectChance, String effect, String shortEffect) {
		super();
		this.move = move;
		this.accuracy = accuracy;
		this.type = type;
		this.power = power;
		this.ppNumber = ppNumber;
		this.priority = priority;
		this.target = target;
		this.effectChance = effectChance;
		this.effect = effect;
		this.shortEffect = shortEffect;
	}

	//toString Method ------------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "PokemonMoves [move=" + move + ", accuracy=" + accuracy + ", type=" + type + ", power=" + power
				+ ", ppNumber=" + ppNumber + ", priority=" + priority + ", target=" + target + ", effectChance="
				+ effectChance + ", effect=" + effect + ", shortEffect=" + shortEffect + "]";
	}

	//Getters and Setters ------------------------------------------------------------------------------------------------------
	public String getMove() {
		return move;
	}
	public String getAccuracy() {
		return accuracy;
	}
	public String getType() {
		return type;
	}
	public int getPower() {
		return power;
	}
	public int getPpNumber() {
		return ppNumber;
	}
	public int getPriority() {
		return priority;
	}
	public String getTarget() {
		return target;
	}
	public float getEffectChance() {
		return effectChance;
	}
	public String getEffect() {
		return effect;
	}
	public String getShortEffect() {
		return shortEffect;
	}

	//Hash code and Equals ------------------------------------------------------------------------------------------------------
	@Override
	public int hashCode() {
		return Objects.hash(accuracy, effect, effectChance, move, power, ppNumber, priority, shortEffect, target, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PokemonMoves other = (PokemonMoves) obj;
		return Objects.equals(accuracy, other.accuracy) && Objects.equals(effect, other.effect)
				&& Float.floatToIntBits(effectChance) == Float.floatToIntBits(other.effectChance)
				&& Objects.equals(move, other.move) && power == other.power && ppNumber == other.ppNumber
				&& priority == other.priority && Objects.equals(shortEffect, other.shortEffect)
				&& Objects.equals(target, other.target) && Objects.equals(type, other.type);
	}
}
