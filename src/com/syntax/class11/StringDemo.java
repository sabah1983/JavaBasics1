package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		
		String school=" Syntax ";
		String str=new String("Hello");
		String str1="This a String 7676,&^&^";
		
		// how many characters String has
		System.out.println("---length() function");
		System.out.println(school.length());
		int size=str.length();
		System.out.println("String length is "+size);
		
		// convert String to lowercase or uppercase
		
		System.out.println("--toUppercase /tolowercase---------");
		System.out.println(school.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		str=str.toLowerCase();
		System.out.println(str);
		
		
		System.out.println("------Conat Function");
		// concatinate 2 string
		String newString=str+school;
		System.out.println(newString);
		
		String day="Saturday";
		String date=" 14";
		String newDate=day.concat(date);
		System.out.println(newDate);
		
		System.out.println("----isEmpty function");
		//tells true if there is no characters inside the string
		//tells false if any characters are inside the string
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("----trim() function------");
		
		//removes empty spaces or white space at the beginning and the end
		String str4="    Welcome to Syntax!   ";
		str4=str4.trim();
		System.out.println("String with no leading or trailing spaces: "+str4);
	}

}
