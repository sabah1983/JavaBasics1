package com.syntax.class18;

public class ConstructorsDemo {
	
	static String str="Hello";
	
	ConstructorsDemo(){
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
	}
	
	ConstructorsDemo(String str){
		System.out.println("I am a constructor with 1 String parameter "+str);
	}
	
	ConstructorsDemo(int num){
		System.out.println("I am a constructor with 1 integer value="+num);
	}
	
	//ConstructorsDemo(int num){
		//System.out.println("I am a constructor");
	//}can't have 2 constructors with the same name and parameters 
	
	ConstructorsDemo(String str, int num){
		System.out.println("I am constructor with 2 parameters:"+str+" & "+num);
	}
	
	void ConstructorsDemo() {
		System.out.println("I don't know who am I");
	}
	
	public static void main(String[] args) {
		//ConstructorsDemo obj=new ConstructorsDemo();
		System.out.println(str);
		ConstructorsDemo obj=new ConstructorsDemo("Yes", 13);
		
		ConstructorsDemo obj1=new ConstructorsDemo();
		obj1.ConstructorsDemo();
	}

}
