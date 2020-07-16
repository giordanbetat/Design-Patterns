package com.giordanbetat.composite;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Collaborator {

	private List<Collaborator> collaborators = new ArrayList<Collaborator>();

	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void print() {
		System.out.println(super.name + ", $" + super.salary);
		for (Collaborator collaboratorAux : collaborators) {
			collaboratorAux.print();
		}
	}

	@Override
	public void add(Collaborator collaborator) {
		collaborators.add(collaborator);
	}

	@Override
	public void remove(Collaborator collaborator) {
		collaborators.remove(collaborator);
	}

}
