package com.syntax.class17;

public class Employee {
	
	//create variables to hold :name, last name, title, SSN, salary
	public static String tital;
	public String name;//Accessible everywhere to every one 
	protected String lastName;//accessible within same package
	double salary;//default accessible within same package
	private long ssn;//accessible only within same class
	
	public static void method1() {
		System.out.println("I am public method");
	}
	protected void method2() {
		System.out.println("I am protected method");
	}
    void method3() {
    	System.out.println("I am defualt method");
    }
    private void method4() {
    	System.out.println("I am private method");
    }
    
    public static void main(String[] args) {
		 Employee emp=new Employee();
		  emp.name="John";
		  emp.lastName="Smith";
		  emp.salary=90000;
		  emp.ssn=908776767;
		  //accessing all method
		  emp.method1();
		  emp.method2();
		  emp.method3();
		  emp.method4();
	}
}
