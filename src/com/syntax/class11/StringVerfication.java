package com.syntax.class11;

public class StringVerfication {

	public static void main(String[] args) {
		String message="Welcome Admin";
		
		//verfiy that message contains username which is Admin
		System.out.println("---contain() function----");
		System.out.println(message.contains("Admin"));
		
		boolean flag=message.contains("welcome");
		System.out.println(flag);
		
		//we want to see if welcome message start with welcome
		System.out.println("---startsWith() function----");
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		
		//we want to verify that welcome message ends with username
		System.out.println("---endsWith() function----");
		String username="Admin";
		boolean ends=message.endsWith(username);
		System.out.println(ends);
		System.out.println(message.endsWith("!"));

	}

}
