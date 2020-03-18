package com.sytax.class07;

public class Task {

	public static void main(String[] args) {
		
		// even numbers
	int num=1;
	while(num<20) {
		if (num%2 ==0) {
			System.out.println(num);
			
		}
		num++;
	}
	
	// 2 way
	int num1=1;
	while (num1<20) {
		System.out.println(num1);
		num1+=2;
	}
	// 3 way
	
	int y=1;
	while(y<=20) {
		System.out.println(y++);
		y++;
	}
	

	}

}
