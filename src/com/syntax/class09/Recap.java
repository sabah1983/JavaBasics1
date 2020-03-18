package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println(i+" "+j);
			}
		} 
		// using nested loop print from 10 to 99
		
		for(int y=1; y<=9; y++) {
			for (int z=0; z<=9; z++) {
				System.out.println(y+""+z);
			}
		}
		
		// using nested loop print clock
		
		for(int i=0; i<=23; i++) {
			for(int b=0; b<=59; b++) {
			if(b<10) {
				System.out.println(i+":0"+b);
			}else {
				System.out.println(i+":"+b);
		}
			
			}
	}
	}
}
