package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
     // not(!)- reverse the condition
		boolean b = !true;
		boolean val = !false;
		System.out.println(b);
		System.out.println(val);
		
		boolean isCold=false;
		if(!isCold) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		String day1="Monday";
		String day2="Friday";
		//if it is not monday or friday find me at syntax
		
		if(!day1.equals("Monday") && !day1.equals("Friday")){
			System.out.println("Find me at Syntax");
			
		}
		if (!(day1.equals("Monday") && day2.equals("Friday"))) {
			System.out.println("Find me at Syntax");
		}
	}

}
