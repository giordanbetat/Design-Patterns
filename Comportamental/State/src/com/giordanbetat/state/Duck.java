package com.giordanbetat.state;

public class Duck extends Bird{

	private Behavior fly;
	private Behavior quack;
	
	public Duck() {
		fly = new Fly();
		quack = new Quack();
	}
	
	@Override
	public void setBehaviorFly(Behavior behavior) {
		fly = behavior;
	}

	@Override
	public void fly() {
		fly.execute();
	}

	@Override
	public void setBehaviorQuack(Behavior behavior) {
		quack = behavior;
	}

	@Override
	public void quack() {
		quack.execute();
	}

}
