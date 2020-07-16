package com.giordanbetat.iterator;

public class Animal {
	
	private String name;
	private String classe;
	
	public Animal(String name, String classe){
		this.name = name;
		this.classe = classe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
}
