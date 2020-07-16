package com.giordanbetat.builder;

public abstract class SandwichBuilder {

	public abstract void openBread();
	
	public abstract void insertIngredients();

	public abstract void closeBread();

	public abstract Sandwich getSandwich();
	
}
