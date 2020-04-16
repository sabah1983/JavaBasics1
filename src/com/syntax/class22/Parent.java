package com.syntax.class22;

public class Parent {
	
	Parent(){
		System.out.println("Parent class constructor");
	}
	
	private void hello() {
		System.out.println("Hello from parent class");
	}
	
	static void bye() {
		System.out.println("Bye from parent class");
	}

}

class Child extends Parent{
	
	Child(){
		System.out.println("Child class constructor");
	}
	
	//@Override we are not overriding we just declaring 
	//private method inside child class
	private void hello() {
		System.out.println("Hello from child class");
	}
	
//	static void bye() {
//		@Override
//		System.out.println("Bye from child class ");
//	}
//	
}
