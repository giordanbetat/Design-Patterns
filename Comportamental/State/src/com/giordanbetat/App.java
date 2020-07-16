package com.giordanbetat;

import com.giordanbetat.state.Duck;
import com.giordanbetat.state.NotFly;

public class App {

	public static void main(String[] args) {
		Duck duck = new Duck();
		
		duck.setBehaviorFly(new NotFly());
		duck.fly();
		duck.quack();
	}

}
