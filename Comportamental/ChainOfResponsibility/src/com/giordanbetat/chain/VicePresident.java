package com.giordanbetat.chain;

public class VicePresident extends DecisionMaker {

	public void approves(Buy compra) {
		if (compra.getValue() < 30000F) {
			System.out.println("Compra aprovada pelo Vice-Presidente.");
		}

		else if (successor != null) {
			successor.approves(compra);
		}
	}
}
