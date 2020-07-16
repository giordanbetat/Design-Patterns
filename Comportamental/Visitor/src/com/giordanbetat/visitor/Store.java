package com.giordanbetat.visitor;
import java.util.ArrayList;
import java.util.List;

public class Store {
	
	private List<Equipament> equipaments = new ArrayList<Equipament>();
	
	public void addEquipamento(Equipament equipament) {
		equipaments.add(equipament);
	}
	
	public List<Equipament> getEquipamentoList() {
		return equipaments;
	}
}