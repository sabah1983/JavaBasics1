package com.syntax.class21;

public class JavaTeacher extends Teacher {
	
	//compiler will try to create default constructor
	//and make a call inside parent class default constructor
	//JavaTeacher() {
	//	super();
	//}
	
    String certification;
	
	JavaTeacher(String name, String lastName, String certification) {
		super(name,lastName);//super always must be first line inside your constructor
		//this(name,lastName);can't have this() and super() in the same constructor
		this.certification=certification;
	}
	//JavaTeacher(){
    //CE Implicit super constructor Teacher() is undefined.
    //Must explicitly invoke another constructor
	//}
	JavaTeacher(String name, String lastName) {
		super(name, lastName);
	}
}
