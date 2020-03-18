package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
	
		//declare a number and copmar if number is larger than 100
		//if number is larger than 100 -->my number is large
		System.out.println("Starting coding");
		
		
		int num=178;
		if(num>100) {
			System.out.println("My number is large");
		}
		System.out.println("End of the program");
		
		System.out.println("-------------");
		 
		
		int expectedHours=15;
		int actualHours=15;
		// if actule is more than expected---> you love java
		
		if(actualHours>=expectedHours) {//if true
			
			System.out.println("You will love Java ");
		}else {//otherwise (if false)--->go inside else block
			
			System.out.println(" You will not like java");
			
			System.out.println("-------------------");
			
		}
			
			
			double budget=100000;
			double carPrice=12000;
				// using if we are doing verification and selective execution
				if(budget>carPrice) {
					System.out.println("I will buy this car today");
					System.out.println("I will be happy");
				}else {
					System.out.println("I will not buy this car today, "
					+"I will go learn java");
					System.out.println("I will be motivated");
				}
			System.out.println("i am code after if condition");
		}
			}


