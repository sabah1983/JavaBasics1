package com.syntax.class19;

public class Student {
	
	String name, address;
	public Student(String name, String address) {
		this.name=name;
		this.address=address;
		
	}
	public void displayInfo() {
		System.out.println("My name is "+name+" and my address is "+address);
	}
	
	public static void main(String[] args) {
		
		Student obj=new Student("Sabah", "Given address");
		obj.displayInfo();
	}

}
