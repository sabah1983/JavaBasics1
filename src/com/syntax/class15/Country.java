package com.syntax.class15;

public class Country {
	void sayHello(String country) {
		switch(country) {
		case "Russia":
			System.out.println("Privet");
			break;
		case "Tajikistan":
			System.out.println("Salom");
			break;
		case "Mexico":
			System.out.println("Hola");
			break;
		default:
				System.out.println("Wrong language");
		}
	}
	public static void main(String[] args) {
		Country hello=new Country();
		
		hello.sayHello("Russia");
		hello.sayHello("Sudan");
	}

}
