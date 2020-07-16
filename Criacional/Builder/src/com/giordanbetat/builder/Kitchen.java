package com.giordanbetat.builder;

public class Kitchen {

	public void doSandwich(SandwichBuilder builder) {
		builder.openBread();
		builder.insertIngredients();
		builder.closeBread();
	}
	
}
