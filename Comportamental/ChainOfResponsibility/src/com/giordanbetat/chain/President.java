package com.giordanbetat.chain;

public class President extends DecisionMaker {

	public void approves(Buy buy) {
		if (buy.getValue() < 100000F) {
			System.out.println("Compra aprovada pelo Presidente.");
		}

		else {
			System.out.println("Compra nao aprovada.");
		}
	}
}
