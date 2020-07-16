package com.giordanbetat.builder;

public class BurguerBuilder extends SandwichBuilder{

	private Sandwich sandwich = new Burguer();

	public void openBread() {
		System.out.println("Abre pão de hamburguer.");
	}

	public void insertIngredients() {
		System.out.println("Insere carne e queijo.");
	}

	public void closeBread() {
		System.out.println("Fecha pão de hamburguer.");
	}

	public Sandwich getSandwich() {
		System.out.println("Hamburguer está pronto");
		return sandwich;
	}

}
