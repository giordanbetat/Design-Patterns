package com.giordanbetat;
import com.giordanbetat.singleton.Window;

public class App {

	public static void main(String[] args) {
		Window window = Window.getInstance();
		window.pack();
		window.setVisible(true);
		
	}
	
}
