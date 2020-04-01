package com.syntax.class19;

public class ClassA {
	String name, lastName, address;
	
	void displayName() {
		System.out.println("My name is "+name+" "+lastName);
	}
	
	void displayAddress() {
		System.out.println("My address is "+address);
	}
	
	static void printF() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		ClassB b=new ClassB();
		b.name="Sabah";
		b.lastName="Abdaullah";
		b.address="Address";
		b.title="Manager";
		b.displayTitle();
		b.displayName();
		b.displayAddress();
		b.printF();
		
		
		ClassC c=new ClassC();
		c.name="Any";
		c.lastName="Any";
		c.address="Any";
		c.title="Any";
		c.phoneNumber=12345678;
		c.displayName();
		c.displayAddress();
		c.displayPhoneNumber();
		c.printF();
	}
}
class ClassB extends ClassA{
	String title;
	public void displayTitle() {
		System.out.println("My title is "+title);	
	}
	
}
class ClassC extends ClassB{
	int phoneNumber;
	
	public void displayPhoneNumber() {
		System.out.println("My phone number is "+phoneNumber);
	}
}


