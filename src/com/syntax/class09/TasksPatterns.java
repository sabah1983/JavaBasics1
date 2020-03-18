package com.syntax.class09;

public class TasksPatterns {

	public static void main(String[] args) {
		/* print
		 * 55555
		 * 4444
		 * 333
		 * 22
		 * 1 
		 */
        for (int r=5; r>=1; r--) {
        	for(int c=1; c<=r; c++) {
        		System.out.print(r);
        	}
        	System.out.println();
        }
	}

}
