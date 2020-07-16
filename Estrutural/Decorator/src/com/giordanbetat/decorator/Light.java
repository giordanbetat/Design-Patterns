package com.giordanbetat.decorator;

public class Light extends Decoration{

	public Light(Tree tree) {
		super(tree);
	}
	
	public void showOrnaments() {
		super.showOrnaments();
		System.out.println("Luz, ");
	}

}
