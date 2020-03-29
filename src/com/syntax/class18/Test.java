package com.syntax.class18;

public class Test {
	String name, lastName;
	int age;
	
	public void printName(){
		System.out.println("My Name is "+name+" "+lastName+" my age is "+age);
	}
	
	Test(String firstName, String myLastName, int myAge){
		name=firstName;
		lastName=myLastName;
		age=myAge;
	}

	public static void main(String[] args) {
		
		Test obj1=new Test("Sabah", "Abdaullah", 35);
		obj1.printName();
		
		

	}

	

}
