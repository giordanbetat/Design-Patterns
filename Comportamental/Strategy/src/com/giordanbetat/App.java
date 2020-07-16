package com.giordanbetat;

import com.giordanbetat.strategy.BubbleSorting;
import com.giordanbetat.strategy.QuickSorting;
import com.giordanbetat.strategy.Vetor;

public class App {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(new BubbleSorting());
		
		vetor.sort();
		vetor.setAlgorithm(new QuickSorting());
		vetor.sort();
		
	}

}
