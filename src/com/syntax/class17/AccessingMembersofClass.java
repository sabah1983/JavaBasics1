package com.syntax.class17;

public class AccessingMembersofClass {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Faisal";//public member
		emp.lastName="Sakhi";//protected member
		emp.salary=100000;//default member
		//emp.ssn=78969;CE field ssn is not visible/private member
		
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4();CE method4 not visible
		

	}

}
