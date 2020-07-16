package com.giordanbetat;

import com.giordanbetat.visitor.Cooker;
import com.giordanbetat.visitor.Equipament;
import com.giordanbetat.visitor.Fridge;
import com.giordanbetat.visitor.PriceEquipamentVisitor;
import com.giordanbetat.visitor.Store;
import com.giordanbetat.visitor.TV;

public class App {

	public static void main(String[] args) {

		Store store = new Store();
				
		PriceEquipamentVisitor visitor = new PriceEquipamentVisitor();
				
		store.addEquipamento(new Fridge("Geladeira", 1000.0));
		store.addEquipamento(new Fridge("Geladeira Duplex", 2500.0));
		store.addEquipamento(new TV("TV LED 58 pol.Z", 4000.0));
		store.addEquipamento(new Cooker("Fogao 6 bocas", 1500.0));
				
		for(Equipament equipament : store.getEquipamentoList()){
			equipament.accept(visitor);
		}
	}
}
