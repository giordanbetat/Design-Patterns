package com.giordanbetat.visitor;

public class PriceEquipamentVisitor extends EquipamentVisitor {

	public void visitFridge(Fridge fridge) {
		System.out.println("Preco da geladeira " + fridge.getName() + " = $ " + String.valueOf(fridge.getPrice()) + 
				" com +4% de impostos, total $ " + String.valueOf(fridge.getPrice() * 1.04));
	}

	public void visitTV(TV tv) {
		System.out.println("Preco da TV " + tv.getName() + " = $ " + String.valueOf(tv.getPrice()) + 
				" com +7% de impostos, total $ " + String.valueOf(tv.getPrice() * 1.07));
	}

	public void visitCooker(Cooker cooker) {
		System.out.println("Preco do Fogao " + cooker.getName() + " = $ " + String.valueOf(cooker.getPrice()) + 
				" com +5% de impostos, total $ " + String.valueOf(cooker.getPrice() * 1.05));
	}
}
