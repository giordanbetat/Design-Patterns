package com.giordanbetat.strategy;

public class Vetor {

	private SortingAlgorithm algorithm;
	
	public Vetor(SortingAlgorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	public void setAlgorithm(SortingAlgorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	public void sort() {
		algorithm.sort();
	}
	
}
