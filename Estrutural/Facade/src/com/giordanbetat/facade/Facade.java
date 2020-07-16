package com.giordanbetat.facade;

public class Facade {

	private SubSystemOne systemOne;
	private SubSystemTwo systemTwo;
	private SubSystemThree systemThree;
	
	public Facade() {
		systemOne = new SubSystemOne();
		systemTwo = new SubSystemTwo();
		systemThree = new SubSystemThree();
	}
	
	public void metodA() {
		systemOne.metodOne();
		systemTwo.metodTwo();
		systemThree.metodThree();
	}
	
	public void metodB() {
		systemThree.metodThree();
		systemTwo.metodTwo();
		systemOne.metodOne();
	}
	
}
