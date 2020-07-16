package com.giordanbetat.visitor;

public class Cooker extends Equipament {

	public Cooker(String name, double price) {
		super(name, price);
	}

	public void accept(EquipamentVisitor visitor) {
		visitor.visitCooker(this);
	}
	
}