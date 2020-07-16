package com.giordanbetat;

import com.giordanbetat.memento.SalesMemory;
import com.giordanbetat.memento.Salesman;

public class App {

	public static void main(String[] args) {
		
		Salesman salesman = new Salesman("Joao", 10000.0F);
		
		System.out.println(salesman.getName() + " - Total de vendas: " + salesman.getTotalSales() + "\n");
		
		SalesMemory memory = new SalesMemory();
		memory.setMemento(salesman.createMemento());
		
		salesman.setName("Pedro");
		salesman.setTotalSales(50000.0F);
		
		System.out.println(salesman.getName() + " - Total de vendas: " + salesman.getTotalSales() + "\n");
		
		salesman.retoreMemeneto(memory.getMemento());
		
		System.out.println(salesman.getName() + " - Total de vendas: " + salesman.getTotalSales() + "\n");
	}

}
