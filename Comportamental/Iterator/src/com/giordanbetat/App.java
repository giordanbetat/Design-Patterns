package com.giordanbetat;
import com.giordanbetat.iterator.Animal;
import com.giordanbetat.iterator.BirdIterator;
import com.giordanbetat.iterator.Zoo;
import com.giordanbetat.iterator.ZooImpl;

public class App {

	public static void main(String[] args) {
	
		Zoo zoo = new ZooImpl();
		
		zoo.addAnimal(new Animal("tigre", "mamifero"));
		zoo.addAnimal(new Animal("pinguim", "ave"));
		zoo.addAnimal(new Animal("jacare", "reptil"));
		zoo.addAnimal(new Animal("leao", "mamifero"));
		zoo.addAnimal(new Animal("elefante", "mamifero"));
		
		BirdIterator iterator = new BirdIterator(zoo);
		
		while(iterator.hasNext()){
			System.out.println(iterator.next().getName());
		}
	}

}
