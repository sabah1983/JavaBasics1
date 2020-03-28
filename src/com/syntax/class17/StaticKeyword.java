package com.syntax.class17;

public class StaticKeyword {
	
	//create a template for a phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	//return type,name and parameters
	static void displayGeneralInfo() {
		System.out.println("We are bulding "+brand+" with touch screen="+touchScreen);
	}
	//instance members of the class can access ALL STATIC members
	void displaySpecifications() {
		System.out.println("WE build phone with "+memory+" GB memory in "+color+" color");
	}
	//STATIC METHOD CANT'T ACCESS NON-STATIC MEMBERS OF THE CLASS
	//static void displaySpecifications1() {
	//	System.out.println("WE build phone with "+memory+" GB memory in "+color+" color");
	//}
	
	public static void main(String[] args) {
		//accessing static variables in static way
	   brand="iPhone";
	   touchScreen=true;
	   //accessing instance variables through the insatnce of the class
	   StaticKeyword obj=new StaticKeyword();
	   obj.color="Gray";
	   obj.memory=64;
	   //accessing static methods in a static way
	   displayGeneralInfo();
	   //accessing static methods i non static way/through instance
	   obj.displayGeneralInfo();//valid but not preferable 
	   obj.displaySpecifications();
	   
	   
	
	}

}
