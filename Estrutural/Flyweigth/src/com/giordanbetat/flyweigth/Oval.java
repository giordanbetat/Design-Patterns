package com.giordanbetat.flyweigth;

public class Oval extends Figure{

	private boolean filled;
	
	public Oval(boolean filled) {
		super();
		this.filled = filled;
	}
	
	@Override
	public void draw(String color) {
		if(filled) {
			System.out.println("Figura oval preenchida " + color);
		}
		else {
			System.out.println("Figura oval não preenchida " + color);
		}
	}

}
