package com.syntax.class10;

public class HwArray {

	public static void main(String[] args) {
		
		//print the following:Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		
		String[][] names= {{"Mr", "Mrs","Ms","Miss"},{"Smith", "Jordan", "Jackson", "Obama"}};
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);

	}


}
