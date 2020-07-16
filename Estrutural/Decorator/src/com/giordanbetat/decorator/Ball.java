package com.giordanbetat.decorator;

public class Ball extends Decoration{

	public Ball(Tree tree) {
		super(tree);
	}
	
	public void showOrnaments() {
		super.showOrnaments();
		System.out.println("Bola, ");
	}

}
