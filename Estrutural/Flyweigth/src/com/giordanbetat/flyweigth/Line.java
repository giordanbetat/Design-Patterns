package com.giordanbetat.flyweigth;

public class Line extends Figure {

	public Line() {
		super();
	}
	
	@Override
	public void draw(String color) {
		System.out.println("Figura linha " + color);
	}
	
}
