package com.giordanbetat.chain;

public class Director extends DecisionMaker {

	public void approves(Buy buy) {
		if (buy.getValue() < 10000F) {
			System.out.println("Compra aprovada pelo Diretor.");
		}

		else if (successor != null) {
			successor.approves(buy);
		}
	}
}
