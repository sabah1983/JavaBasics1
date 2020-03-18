package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		/*
		 * writ a program to ask user if there is a sale if there no sale--> not going
		 * shopping if there is a sale we will ask the price of the item based on the
		 * price we will apply discount and calculate final price if the price less than
		 * 20 --->apply 10% discount if price between 20 and 100 ---> apply 20% if price
		 * between 100 and 500 ---> apply 30% if price more than 500 ----> apply 50%
		 * after discount_____the price of the item reduced from____to_____
		 */
		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
		scan = new Scanner(System.in);
		System.out.println("Is there sale?");
		sale = scan.nextLine();
		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price?");
			price = scan.nextDouble();
			if (price <= 20) {
				discount = price * 0.1;

			} else if (price > 20 && price <= 100) {
				discount = price * 0.2;
			} else if (price > 100 && price <= 500) {
				discount = price * 0.3;
			} else {
				discount = price * 05;
			}
			finalPrice = price - discount;
			System.out.println("After " + discount + " discount the price of the item reduced from " + price + " to "
					+ finalPrice);
		} else {
			System.out.println("No shopping today");
		}

	}

}
