package com.syntax.class18;

public class Car {
	
	String make, model, color;
	int year;
	
	public void printDetails() {
		System.out.println("I have "+year+" "+make+" "+model+" in "+color+" color");
	}
	
	public static void main(String[] args) {
		Car car1=new Car();
		//we are using instance variable without assigning any value
		//constructor initializes all instance variable and assigning default values to them
		System.out.println(car1.year);
		
		//int doors;
		//System.out.println(doors);CE local must be initialized 
		
	}


}
