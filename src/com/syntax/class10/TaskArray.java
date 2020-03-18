package com.syntax.class10;

public class TaskArray {

	public static void main(String[] args) {
		// create an array of animals
		String[] animals= {"Dog", "Cat", "Lion", "Elefent", "Deer", "Fox"};
		for(String animal:animals) {
			System.out.println(animal);
		}
		
	// 2 way
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}

	}

}
