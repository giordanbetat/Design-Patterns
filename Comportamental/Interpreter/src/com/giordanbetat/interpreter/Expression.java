package com.giordanbetat.interpreter;

public abstract class Expression {
	
	public void Interpret(Context context)
    {
      if (context.getInput().length() == 0)
        return;
 
      if (context.getInput().startsWith(nine()))
      {        
        context.setOutput(context.getOutput() + (9 * multiplicator()));
        context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(four()))
      {
    	context.setOutput(context.getOutput() + (4 * multiplicator()));  
    	context.setInput(context.getInput().substring(2));
      }
      else if (context.getInput().startsWith(five()))
      {
    	context.setOutput(context.getOutput() + (5 * multiplicator()));  
      	context.setInput(context.getInput().substring(1));
      }
 
      while (context.getInput().startsWith(one()))
      {
    	context.setOutput(context.getOutput() + (1 * multiplicator()));  
      	context.setInput(context.getInput().substring(1));
      }
    }
 
    public abstract String one();
    public abstract String four();
    public abstract String five();
    public abstract String nine();
    public abstract int multiplicator();
}
