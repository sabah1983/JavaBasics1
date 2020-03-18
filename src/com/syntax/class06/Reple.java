package com.syntax.class06;

import java.util.Scanner;

public class Reple {
	public static void main(String[] args){
		  Scanner input;
		  String name;
		  input=new Scanner(System.in);
		  System.out.println("Enter name of the instructor");
		  name=input.nextLine();
		  switch(name){
		    case "Shiva":
		   System.out.println("Will take care of Java Assignment");
		      break;
		    case "Sandish":
		    System.out.println("Will take care of SDLC Assignment");
		      break;
		    case "Weqas":
		    System.out.println("Will take care of Selenium Assignment");
		      break;
		    case "Asel":
		    System.out.println("Will take care of every Assignment");
		      break;
		    default :
		    	 System.out.println("Invalid instructor selected");
		      break;
		  }
		 
		}
}
