package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
        /* TODO
         Write a program to find the largest of three double values using if-else..if
         and logical operators provided by a user (numbers must be distinct)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three distinct double number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
      if( num1 >= num2 && num1 >= num3) {
          System.out.println(num1+" is the largest Number");
      }
      else if (num2 >= num1 && num2 >= num3) {
          System.out.println(num2+" is the largest Number");
      }
      else {
          System.out.println(num3+" is the largest Number");
      }
  }

}
