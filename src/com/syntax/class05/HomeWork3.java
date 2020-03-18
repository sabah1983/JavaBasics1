package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
        /* TODO
        Write a program for user to enter his/her birth month.
        Based on the month define the season.
        Example: if user is born in June, July or August --> Season = "Summer"
        At the end of the program we should see output as "You were born ______".
        */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your birth month");
        String month = input.next();
        if (month.equals("June") || month.equals("July") || month.equals("August")) {
                System.out.println("You were born in the Summer");
        }
        else if (month.equals("September") || month.equals("October") || month.equals("November")) {
                System.out.println("You were born in the Fall(Autumn)");
        }
        else if (month.equals("December") || month.equals("January") || month.equals("February")) {
                System.out.println("You were born in the Winter");
        }
        else if (month.equals("March") || month.equals("April") || month.equals("May")){
                System.out.println("You were born in the Spring");
        }
        else {
                System.out.println("Not a valid month. Please enter a valid month starting with a capital letter");
        }
}
}
