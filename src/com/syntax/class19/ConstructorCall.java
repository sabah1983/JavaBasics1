package com.syntax.class19;

public class ConstructorCall {
	
	public ConstructorCall(){
		System.out.println("I am non argument constructor");
	}
	
	public ConstructorCall(String str){
		this();
	}
	
	public ConstructorCall(String str, String str1) {
		//this("str","str");CE
		//this(12);CE
		this("Hello");
	}
	
	public static void main(String[] args) {
		//creating an object by passing two String values
		ConstructorCall obj=new ConstructorCall("Java", "Love");
	}

}
