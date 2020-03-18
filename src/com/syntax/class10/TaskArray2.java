package com.syntax.class10;

public class TaskArray2 {

	public static void main(String[] args) {

   String[] countries= {"Sudan", "Egypt", "USA"};
   String[] capitals= {"Khartoum", "Cairo", "DC"};
   for(int i=0; i<3; i++) {
	  System.out.println("The capital of "+countries[i]+" is "+capitals[i]);
   }
     
   String[][] country= {{"Sudan", "Egypt","USA"},{"Khartoum","Cairo","DC"}};
   System.out.println("The capital of "+country[0][0]+" is "+country[1][0]);
	}


	}


