package com.syntax.class17;

public class AccessingMembersofClass {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Faisal";
		emp.lastName="Sakhi";
		emp.salary=100000;
		//emp.ssn=78969;CE field ssn is not visible 
		
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4();CE method4 not visible
		

	}

}
