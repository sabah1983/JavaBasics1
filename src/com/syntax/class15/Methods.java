package com.syntax.class15;

public class Methods {
	//creat a method that will say welcome 10 times
	
	void sayWelcome () {
		
		for (int i=0; i<10; i++) {
			System.out.println("Welcome");
		}
		
	}
	
	//creat method that will say any word
	//#number of times
	
	void sayAnything(String word, int times) {
		for(int i=1; i<=times; i++) {
			System.out.println(word);
		}
	}
	
	//creat a method that isItRaining
	//will accept boolean value as parameter
	//and based on the value it will print message accordingly
	
	void isItRaining(boolean isRain) {
		if(isRain) {
			System.out.println("It is raining stay home and learn Java");
		}else {
			System.out.println("It is not raining go for a walk");
		}
	}

}
