package com.syntax.class09;

public class HwArray {

	public static void main(String[] args) {
		// creat an array of chars
		char [] grades=new char [6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		// 2 way
		
		char [] grade={'A' , 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grade[1]);
		
		// how many elements stored inside an array?
		
		int arraySize=grades.length;
		System.out.println("Total elements "+arraySize);
		
		// how we can access last element from an array
		
		System.out.println(grades[arraySize-1]);
		
		// access all element from an array
		for(int i=0; i<arraySize; i++) {
			System.out.println(grades[i]);
		}
		System.out.println("printing using advanced for loop");
		
		for(char grade1:grades) {
			System.out.println(grade);
		}
		

	}

}
