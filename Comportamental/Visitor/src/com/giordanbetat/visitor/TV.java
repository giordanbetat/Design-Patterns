package com.giordanbetat.visitor;

public class TV extends Equipament {

	public TV(String name, double price) {
		super(name, price);
	}

	public void accept(EquipamentVisitor visitor) {
		visitor.visitTV(this);
	}
	
}