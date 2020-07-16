package com.giordanbetat;

import com.giordanbetat.template.Game;
import com.giordanbetat.template.Soccer;

public class App {

	public static void main(String[] args) {
		Game game = new Soccer();
		
		game.play();
	}

}
