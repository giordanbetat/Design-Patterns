package com.giordanbetat.visitor;

public class Fridge extends Equipament {

	public Fridge(String name, double price) {
		super(name, price);
	}

	public void accept(EquipamentVisitor visitor) {
		visitor.visitFridge(this);
	}
	
}