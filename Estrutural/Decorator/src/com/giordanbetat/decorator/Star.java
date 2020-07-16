package com.giordanbetat.decorator;

public class Star extends Decoration{

	public Star(Tree tree) {
		super(tree);
	}
	
	public void showOrnaments() {
		super.showOrnaments();
		System.out.println("Estrela, ");
	}

}
