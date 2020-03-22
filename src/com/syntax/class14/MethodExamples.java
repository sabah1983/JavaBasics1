package com.syntax.class14;

public class MethodExamples {
	
	// want to create a method 
	//that will be greeting a person

    void greet() {
		System.out.println("Hello Sabah");
	}
    
    void greet1(String name) {
    	System.out.println("Hello "+name);
    }
	
	public static void main(String[] args) {
		// how do i call/access method greet?
		//1.create an object of the class where that method belongs
		//calssName variableName=new className();
	    MethodExamples object1 = new MethodExamples();
	    object1.greet1("Sabah");
	    object1.greet1("Tarek");
	    object1.greet1("Sam");
	    object1.greet1("John");
	}
}
