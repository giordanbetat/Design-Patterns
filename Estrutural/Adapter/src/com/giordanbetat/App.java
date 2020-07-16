package com.giordanbetat;
import com.giordanbetat.adapter.AdapterAmericanToBrazilian;
import com.giordanbetat.adapter.AmericanPlug;

public class App {
	
	public static void main(String[] args) {
		
		AmericanPlug americanPlug = new AmericanPlug();
		
		AdapterAmericanToBrazilian adapter = new AdapterAmericanToBrazilian();
		
		String connectAdapter = adapter.connect(americanPlug);
		
		System.out.println(connectAdapter);
	}
	
}
