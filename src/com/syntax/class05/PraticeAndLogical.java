package com.syntax.class05;

import java.util.Scanner;

public class PraticeAndLogical {

	public static void main(String[] args) {
   
   int height;
   Scanner scan=new Scanner (System.in);
   System.out.println("Please enter your height");
   height=scan.nextInt();
   if (height<=60) {
	   System.out.println("You are short");
   }else if (height>=60 && height<=72) {
	   System.out.println("You are medium");
   }else if (height>72) {
	   System.out.println("You are tall");
   }else {
	   System.out.println("You dont know your height");
   }
	}

}
