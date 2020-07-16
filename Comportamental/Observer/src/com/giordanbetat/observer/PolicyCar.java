package com.giordanbetat.observer;
import java.util.Observable;
import java.util.Observer;

public class PolicyCar implements Observer, Car{

	@Override
	public void front() {
		System.out.println("Viatura segue em frente.");
	}

	@Override
	public void rigth() {
		System.out.println("Viatura vira a direita.");
	}

	@Override
	public void left() {
		System.out.println("Viatura vira a esquerda.");
	}

	@Override
	public void stop() {
		System.out.println("Viatura para.");
	}

	@Override
	public void update(Observable observable, Object arg) {
		StolenCar stolenCar = (StolenCar)observable;
		String action = String.valueOf(arg);
		
		if(action.equals("frente")){
			this.front();
		}
		else if(action.equals("direita")){
			this.rigth();
		}
		else if(action.equals("esquerda")){
			this.left();
		}
		else if(action.equals("pára")){
			this.stop();
		}
	}

}
