package com.giordanbetat.bridge;

public abstract class Teacher {

	protected Implementer implementer = new TeacherGraduatedImpl();
	
	protected Teacher(Implementer implementer) {
		this.implementer = implementer;
	}
	
	public abstract void op();
	
}
