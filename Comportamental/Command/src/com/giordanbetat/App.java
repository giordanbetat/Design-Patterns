package com.giordanbetat;

import com.giordanbetat.command.Calculator;
import com.giordanbetat.command.Invoker;
import com.giordanbetat.command.Sum;

public class App {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		Invoker invoker = new Invoker();
		
		invoker.compute(new Sum(calculator, 10));
		invoker.compute(new Sum(calculator, 15));
		invoker.compute(new Sum(calculator, 5));
		
		invoker.undo(1);
	}

}
