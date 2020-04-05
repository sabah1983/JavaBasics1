package com.syntax.class22;

public class OverLoadingMain {
	
	public static void main(int [] args) {
		System.out.println("Method with int array argument.");
	}
	
	public static void main(String args) {
		System.out.println("Method with String argument.");
	}
	
	public static void main(String args, String args1) {
		System.out.println("Method with 2 String argument.");
	}
	
	public static void main(String args, int num) {
		System.out.println("Method with String and int argument.");
	}
	
	public static void main(int num, String args) {
		System.out.println("Method with int and String argument.");
	}
	
	public static void main(String[] args) {//Java always looks for this main method with this signature
		System.out.println("Method with String array argument.");
		OverLoadingMain.main("str");
		main("str");
		main("hello","hi");
		//int[] arr=new int[2];
		main(new int[2]);
		main(12,"hi");
		main("hello",10);
	}

}
