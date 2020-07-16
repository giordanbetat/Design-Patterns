package com.giordanbetat.builder;

public class FishBuilder extends SandwichBuilder{

	private Sandwich sandwich = new Burguer();

	public void openBread() {
		System.out.println("Abre pão de fishburguer.");
	}

	public void insertIngredients() {
		System.out.println("Insere file de peixe.");
	}

	public void closeBread() {
		System.out.println("Fecha pão de fishburguer.");
	}

	public Sandwich getSandwich() {
		System.out.println("Fishburguer está pronto");
		return sandwich;
	}

}
