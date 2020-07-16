package com.giordanbetat.chain;

public abstract class DecisionMaker {
	protected DecisionMaker successor;

	public void setSuccessor(DecisionMaker successor) {
		this.successor = successor;
	}

	public abstract void approves(Buy buy);
}
