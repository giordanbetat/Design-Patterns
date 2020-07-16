package com.giordanbetat.command;
import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List<Command> commands = new ArrayList<Command>();
	private int current = 0;

	public void compute(Command command) {
		command.execute();
		commands.add(command);
		current++;
	}

	public void undo(int levels) {
		for (int i = 0; i < levels; i++) {
			if (current > 0) {

				Command command = commands.remove(--current);
				command.undo();
			}
		}
	}

}
