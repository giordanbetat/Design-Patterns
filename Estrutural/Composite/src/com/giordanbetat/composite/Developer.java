package com.giordanbetat.composite;
public class Developer extends Collaborator{

	public Developer(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void print() {
		System.out.println(super.name + ", $" + super.salary);
	}

	@Override
	public void add(Collaborator collaborator) {
		 System.out.println("Não é possível adicionar empregado subordinado do programador");
	}

	@Override
	public void remove(Collaborator collaborator) {
		System.out.println("Não é possível remover empregado subordinado do programador");
	}

}
