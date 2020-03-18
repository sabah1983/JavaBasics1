package com.sytax.class07;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean rain=true;
		if(rain) {
		System.out.println("Take umbrella");//one time
		}
		while(rain) {
			//System.out.println("Take umbrella");//infinite
		
		}
		while(rain) {
			System.out.println("Take umbrella");//one time
			rain=false;
		}
	}

}
