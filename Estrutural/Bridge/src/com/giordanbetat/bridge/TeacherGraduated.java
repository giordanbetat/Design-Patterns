package com.giordanbetat.bridge;

public class TeacherGraduated extends Teacher {

	public TeacherGraduated(Implementer implementer) {
		super(implementer);
	}

	public void op() {
		implementer.opImpl();
	}

}
