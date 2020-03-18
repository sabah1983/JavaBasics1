package com.syntax.class06;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		/*use scanner to create calculator
		 * allow user to enter 2 numbers
		 * use operator (+,-,*,/)
		 * provid the result
		 */
		Scanner scan;
		int num1;
		int num2;
		int result = 0;
		char operator;
		scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		num1=scan.nextInt();
		System.out.println("Please enter second number");
		num2=scan.nextInt();
		System.out.println("Please enter operator");
		operator=scan.next().charAt(0);
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		}
    System.out.println("The result of "+num1+operator+num2+" is "+result);
	}

}
