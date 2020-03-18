package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*Ask user to enter their country
		 * capture the value of the country
		 * print which language they speak
		 */
		Scanner scan;
		String country;
		String language;
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		switch(country) {
		case "Egept":
			language="Arabic";
			break;
		case "Sudan":
			language="Arabic";
			break;
		case "USA":
			language="English";
			break;
		case "Turky":
			language="Turkish";
			break;
			default:
				language="Unknown";
				break;
				
		}
		System.out.println("Your language is "+language);

	}

}
