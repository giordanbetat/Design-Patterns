package com.giordanbetat.bridge;

public class TeacherPosGraduated extends Teacher {

	public TeacherPosGraduated(Implementer implementer) {
		super(implementer);
	}

	public void op() {
		implementer.opImpl();
	}

}
