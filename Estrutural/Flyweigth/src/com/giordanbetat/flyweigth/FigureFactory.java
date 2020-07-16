package com.giordanbetat.flyweigth;
import java.util.HashMap;

public class FigureFactory {

	private static final HashMap<String, Figure> figures = new HashMap<String, Figure>();
	
	public static Figure getFigure(String name) {
		Figure figure = figures.get(name);
		
		if(figure == null) {
			if(name.equals("oval preenchida")) {
				figure = new Oval(true);
			}
			else if(name.equals("oval não preenchida")) {
				figure = new Oval(false);
			}
			else if(name.equals("linha")) {
				figure = new Line();
			}
			
			figures.put(name, figure);
		}
		
		return figure;
	}

}
