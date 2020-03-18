package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		// creat array of groceries
		
		String [][] groceries={{"cucumber","ptoto","carrot"},{"mango","apple","banana","kiwi"},
				{"milk","cheese","yogurt"}};
		System.out.println(groceries[1][2]);
		
		// get all values from 2D array
		
		for(int r=0; r<groceries.length; r++) {
			// loop through colums
			for (int c=0; c<groceries.length; c++) {
				System.out.println(groceries[r][c]);
			}
			System.out.println();
		}
		System.out.println("---getting elements using advanced for loop");
		// loop through all arrays
		for(String[] array:groceries) {
			// loop through each single array
			for(String items:array) {
				System.out.print(items+" ");
			}
			System.out.println();
		}

	}

}
