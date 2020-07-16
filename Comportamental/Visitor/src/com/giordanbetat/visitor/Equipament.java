package com.giordanbetat.visitor;

public abstract class Equipament {
	private String name;
	private double price;
	
	public Equipament(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void accept(EquipamentVisitor visitor);
	
}