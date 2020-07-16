package com.giordanbetat.chain;

public class Manager extends DecisionMaker {
	
	public void approves(Buy buy) {
		if (buy.getValue() < 1000F) {
			System.out.println("Compra aprovada pelo Gerente.");
		}

		else if (successor != null) {
			successor.approves(buy);
		}
	}
}
