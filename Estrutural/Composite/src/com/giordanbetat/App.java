package com.giordanbetat;

import com.giordanbetat.composite.Developer;
import com.giordanbetat.composite.Manager;

public class App {

	public static void main(String[] args) {
		Developer developerJt = new Developer("Giordan", 5000);
		Developer developerSenior = new Developer("José", 5000);

		Manager manager1 = new Manager("Maria", 10000);

		manager1.add(developerJt);
		manager1.add(developerSenior);
		
		manager1.print();
	}

}
