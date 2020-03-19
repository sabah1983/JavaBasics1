package com.syntax.class13;

public class Q1 {
	public static void main(String[] args) {
		
	
	/*write a program to swap 2 numbers without a temporary variable?
	 * swap strings without a temporary variable
	 */
	
	int a=100;
	int b=200;
	
	a=a+b;//30
	b=a-b;//10
	a=a-b;
	
	System.out.println("The value of a = "+a);
	System.out.println("The value of b = "+b);
	
	
	String str1="Day";
	String str2="Night";
	
	str1=str1.concat(str2);//DayNight
	str2=str1.substring(0, str1.length()-str2.length());//Day
	str1=str1.substring(str2.length());//Night
	
	System.out.println("The value of str1 = "+str1);
	System.out.println("The value of str2 = "+str2);
	
	//another way
	
	String s1="Hello";
	String s2="Bye";
	
	String shortstr1=s1+s2;
	s2=shortstr1.replace(s2, "");
	s1=shortstr1.replace(s2, "");
	
	System.out.println(s1);
	System.out.println(s2);
}

}
