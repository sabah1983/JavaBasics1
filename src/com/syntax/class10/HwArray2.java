package com.syntax.class10;

public class HwArray2 {

	public static void main(String[] args) {
		/*Create a 2D array that first row will contain 4 names and second row will contain grades. 
		 * Then you program should print name of the students that has A and B grade.
		 */
         String[][] students= {{"John", "James","David", "Smith"},{"A", "B", "C", "D"}};
         
         System.out.println(students[0][0]+" and "+students[0][1]+" have the highst grade");
	}

}
