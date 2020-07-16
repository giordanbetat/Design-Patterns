package com.giordanbetat;

import com.giordanbetat.observer.PolicyCar;
import com.giordanbetat.observer.StolenCar;

public class App {

	public static void main(String[] args) {
		PolicyCar policyCar = new PolicyCar();
		StolenCar stolenCar = new StolenCar();
		
		stolenCar.addObserver(policyCar);
		
		stolenCar.front();
		stolenCar.rigth();
		stolenCar.left();
		stolenCar.stop();
	}

}
