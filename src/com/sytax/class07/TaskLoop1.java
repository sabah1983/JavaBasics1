package com.sytax.class07;

import java.util.Scanner;

public class TaskLoop1 {

	public static void main(String[] args) {
		// we are playing a lottery and a lucky number is 17;
		// we want to keep asking the user any number from 1-20
		// until he guess the lucky number---> congrats
		
		Scanner input;
		int num;
		int luckyNumber=17;
		input=new Scanner(System.in);
		
		
		do {
			System.out.println("Please enter any number from 1 to 20");
			num=input.nextInt();
			
		}while(num!=luckyNumber);
		
		System.out.println("You got it !!!!!");
		

	}

}
