package com.giordanbetat.iterator;
import java.util.Iterator;

public class BirdIterator implements Iterator<Animal> {

	private Zoo zoo;
	private int pos = 0;
	
	public BirdIterator(Zoo zoo){
		this.zoo = zoo;
	}
	
	public boolean hasNext() {
		for(int i=pos; i < zoo.getAnimals().size(); i++) {
			Animal animal = zoo.getAnimals().get(i);
			if(animal.getClasse().equalsIgnoreCase("ave")){
				return true;
			}
		}
		return false;
	}

	public Animal next() {
		while(pos < zoo.getAnimals().size()) {
			Animal animal = zoo.getAnimals().get(pos);
			pos++;
			
			if(animal.getClasse().equalsIgnoreCase("ave")){
				return animal;
			}
		}
		return null;
	}

}
