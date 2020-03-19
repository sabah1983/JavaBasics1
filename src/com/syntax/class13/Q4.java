package com.syntax.class13;

public class Q4 {
	public static void main(String[] args) {
		/*
		 * Find out how many alpha characters are present in a String?  
		 * Find number of words in string?
		 */
		
		String str="Hello Family !&^";
		str=str.replaceAll("[^A-Za-z]", "");
		int number=str.length();
		
		System.out.println("Number of alpha character = "+number);
		
		String myString="Today is Wednesday and it is Java class";
		String [] array=myString.split(" ");
		int words=array.length;
		
		System.out.println("Totale words in string "+myString+" = "+words);
		
	}

}
