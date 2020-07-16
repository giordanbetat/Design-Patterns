package com.giordanbetat.singleton;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = 3383181928776736928L;
	
	private static Window window = null;

	private Window() {
		setPreferredSize(new Dimension(200, 200));
	}

	public static Window getInstance() {
		if (window == null) {
			window = new Window();
		}
		return window;
	}

}
