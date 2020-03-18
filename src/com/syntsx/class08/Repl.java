package com.syntsx.class08;

import java.util.Scanner;

public class Repl {
	 public static void main(String[] args) {
		    Scanner inp;
		    int end;
		    System.out.print("Int:");
		    //write your code below
		    inp=new Scanner(System.in);
		    end=inp.nextInt();
		    for( int i=0; i<2*end; i++){
		      System.out.print(i+" ");
		    }

	 }
}