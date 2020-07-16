package com.giordanbetat;

import com.giordanbetat.flyweigth.Figure;
import com.giordanbetat.flyweigth.FigureFactory;

public class App {

	public static void main(String[] args) {
		Figure figure = FigureFactory.getFigure("linha");
		figure.draw("amarela");
		
		figure = FigureFactory.getFigure("oval não preenchida");
		figure.draw("vermelha");
	}

}
