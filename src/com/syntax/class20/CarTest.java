package com.syntax.class20;

public class CarTest {
	public static void main(String[] args) {
		Car car=new Car();
		
		System.out.println("----------------");
		
		Mercedes merc=new Mercedes("AMG");
		merc.display();
		
		Mercedes merc1=new Mercedes("NO AMG");
		merc1.display();
	}

}
