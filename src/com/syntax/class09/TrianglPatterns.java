package com.syntax.class09;

public class TrianglPatterns {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------");
		
		// print from 1 to 5
		
		for (int r=1; r<=5; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
