package com.giordanbetat;

import com.giordanbetat.chain.Buy;
import com.giordanbetat.chain.DecisionMaker;
import com.giordanbetat.chain.Director;
import com.giordanbetat.chain.Manager;
import com.giordanbetat.chain.President;
import com.giordanbetat.chain.VicePresident;

public class App {

	public static void main(String args[]) {

		DecisionMaker president = new President();
		DecisionMaker vicepresident = new VicePresident();
		DecisionMaker director = new Director();
		DecisionMaker manager = new Manager();

		manager.setSuccessor(director);
		director.setSuccessor(vicepresident);
		vicepresident.setSuccessor(president);

		Buy buy = new Buy(500F);
		manager.approves(buy);
	}
}
