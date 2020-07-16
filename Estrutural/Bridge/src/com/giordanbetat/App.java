package com.giordanbetat;
import com.giordanbetat.bridge.Teacher;
import com.giordanbetat.bridge.TeacherGraduated;
import com.giordanbetat.bridge.TeacherGraduatedImpl;

public class App {

	public static void main(String[] args) {
		
		Teacher teacher = new TeacherGraduated(new TeacherGraduatedImpl());
		teacher.op();

	}

}
