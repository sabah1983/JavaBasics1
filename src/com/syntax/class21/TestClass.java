package com.syntax.class21;

public class TestClass {

	public static void main(String[] args) {
		
		MathTeacher mt=new MathTeacher("Brian","Quissbert");
		System.out.println(mt.name+" "+mt.lastName);
		
		MathTeacher mt1=new MathTeacher("Sarmed","Halabi");
		System.out.println(mt1.name+" "+mt1.lastName);
		
		JavaTeacher jt=new JavaTeacher("Anna", "Smith", "Java 8");
		System.out.println(jt.name);

	}

}
