package com.giordanbetat;
import com.giordanbetat.builder.BurguerBuilder;
import com.giordanbetat.builder.FishBuilder;
import com.giordanbetat.builder.Kitchen;
import com.giordanbetat.builder.SandwichBuilder;

public class App {

	public static void main(String[] args) {
		
		Kitchen kitchen = new Kitchen();
		
		SandwichBuilder builder1 = new BurguerBuilder();
		SandwichBuilder builder2 = new FishBuilder();
		
		kitchen.doSandwich(builder1);
		builder1.getSandwich();
		System.out.println("==========================");
		kitchen.doSandwich(builder2);
		builder2.getSandwich();
	}

}
