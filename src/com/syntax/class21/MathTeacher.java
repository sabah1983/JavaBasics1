package com.syntax.class21;

public class MathTeacher extends Teacher {
	
	public MathTeacher(String name, String lastName) {
		//super();compiler will call implicitly if you don't
		super(name, lastName);
		//System.out.println("I am a child class constructor");
	}

}
