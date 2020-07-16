package com.giordanbetat;

import com.giordanbetat.decorator.Ball;
import com.giordanbetat.decorator.ChristmasTree;
import com.giordanbetat.decorator.Light;
import com.giordanbetat.decorator.Star;
import com.giordanbetat.decorator.Tree;

public class App {

	public static void main(String[] args) {
		Tree tree = new ChristmasTree();
		
		tree = new Star(tree);
		tree = new Ball(tree);
		tree = new Light(tree);
		tree = new Star(tree);
		tree = new Ball(tree);
		tree = new Star(tree);
		tree = new Ball(tree);
		
		tree.showOrnaments();
	}
	
}
