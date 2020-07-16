package com.giordanbetat;
import java.util.ArrayList;
import java.util.List;

import com.giordanbetat.interpreter.Context;
import com.giordanbetat.interpreter.Expression;
import com.giordanbetat.interpreter.Hundred;
import com.giordanbetat.interpreter.Ten;
import com.giordanbetat.interpreter.Thousand;
import com.giordanbetat.interpreter.Unity;


public class App {

	public static void main(String[] args) {

		String roman = "MCMXXVIII";
	    Context context = new Context(roman);
	 
	    List<Expression> tree = new ArrayList<Expression>();
	    tree.add(new Thousand());
	    tree.add(new Hundred());
	    tree.add(new Ten());
	    tree.add(new Unity());
	 
	    for (Expression exp : tree) {
	      exp.Interpret(context);
	    }
	      
	    System.out.println(context.getOutput());
	}

}
