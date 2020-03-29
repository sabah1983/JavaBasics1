package com.syntax.class18;

public class Task {
	
	//Write a program that will have a constructor: 
	//one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors.
	
	String name, lastName;
	int age;
	
	Task(){
		System.out.println("This is constructor without parameters");
	}
	
	public void printName(){
		System.out.println("My Name is "+name+" "+lastName+" my age is "+age);
	}
	public static void main(String[] args) {
		Task obj=new Task();
		
		obj.name="Sabah";
		obj.printName();
	}


}
