package com.syntax.class11;

public class Tasks {

	public static void main(String[] args) {
		// 
		String [][] cars= {
				
				{"Chevy","Ford","GMC"},
				{"Honda","BMW","Audi"},
				{"Kia","Hundai","Lexus"},
				{"Fiat","Mercedes","Lamborghni"}
		};
              for(int i=0; i<cars.length; i++) {
            	  for(int c=0; c<cars.length; c++) {
            		  System.out.println(cars[i][c]);
            	  }
            	  System.out.println();
              }
	}

}
