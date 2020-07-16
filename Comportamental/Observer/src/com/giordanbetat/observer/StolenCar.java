package com.giordanbetat.observer;
import java.util.Observable;

public class StolenCar extends Observable implements Car{

private String action = "";
	
	public void front() {
		action = "frente";
		System.out.println("Carro roubado segue em frente.");
		this.changeState();
	}

	public void rigth() {
		action = "direita";
		System.out.println("Carro roubado vira a direita.");
		this.changeState();
	}

	public void left() {
		action = "esquerda";
		System.out.println("Carro roubado vira a esquerda.");
		this.changeState();
	}
	
	public void stop() {
		action = "pára";
		System.out.println("Carro roubado pára.");
		this.changeState();
	}
	
	public void changeState(){
		setChanged();
		notifyObservers(action);
	}
	
}
