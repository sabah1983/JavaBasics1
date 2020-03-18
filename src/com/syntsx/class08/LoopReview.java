package com.syntsx.class08;

public class LoopReview {

	public static void main(String[] args) {
		int evenSum=0;
		int oddSum=0;
		
		for (int i=1; i<=99; i++) {
			if (i%2==0) {
				evenSum=evenSum+1;
			}else {
				oddSum=oddSum+1;
			}
		}
		
		System.out.println("Sum of evens ="+evenSum);
		System.out.println("Sum of odds ="+oddSum);
	}
	
	

}
