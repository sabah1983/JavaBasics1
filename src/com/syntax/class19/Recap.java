package com.syntax.class19;

public class Recap {

	Recap() {
		System.out.println("Constructhor with no arguments");
	}

	Recap(int num) {
		System.out.println("Constructor with one parameter");
	}

	public static void main(String[] args) {

		Recap obj = new Recap(2);
		// Recap obj1=new Recap("Hi");CE:Constructor id undefined
	}

}
