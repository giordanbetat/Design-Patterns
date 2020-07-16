package com.giordanbetat.memento;

public class Memento {

	private String name = "";
	private float totalSales = 0.0F;
	
	public Memento(String name, float totalSales){
		this.name = name;
		this.totalSales = totalSales;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(float totalSales) {
		this.totalSales = totalSales;
	}
}
