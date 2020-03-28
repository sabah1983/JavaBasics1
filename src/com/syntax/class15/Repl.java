package com.syntax.class15;

import java.util.Scanner;

public class Repl {
	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = inp.nextLine();
		   	//write your code below
		   	String str=givenString;
		   	
		   	String rev="";
		   	int len=givenString.length();
		   	
		   	for(int i=len-1; i>=0; i--){
		   	  rev=rev+givenString.charAt(i);
		   	  
		   	}
		   	if(str.replace(" ", "").equalsIgnoreCase(rev)){
			   	  System.out.println(true);
			   	}else{
			   	  System.out.println(false);
			   	}
		   	
	 }
}
