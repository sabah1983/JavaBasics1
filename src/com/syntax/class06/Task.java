package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/* Allow user to enter grade
		 * if A-->Excellent
		 * if B -->Good
		 * if C -->avarge
		 * if D -->Bad
		 * any other grade -->Not acceptable
		 */
	  Scanner scan;
      String explanation;
      char grade;
      scan=new Scanner(System.in);
      System.out.println("Please enter your grade");
      grade=scan.next().charAt(0);
      switch(grade) {
      case 'A':
    	  explanation="Excelent";
    	  break;
      case 'B':
    	  explanation="Good";
      case 'C':
    	  explanation="Avarge";
    	  break;
      case 'D':
    	  explanation="Bad";
    	  break;
     default:
    	 explanation="Not Acceptable";
    	 break;
    	  
      }
      System.out.println("Your grade is "+explanation);
	}

}
