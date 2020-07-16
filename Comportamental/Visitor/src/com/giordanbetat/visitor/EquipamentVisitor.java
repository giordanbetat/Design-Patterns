package com.giordanbetat.visitor;

public abstract class EquipamentVisitor {
	
	public abstract void visitFridge(Fridge fridge);
	public abstract void visitTV(TV tv);
	public abstract void visitCooker(Cooker cooker);
}