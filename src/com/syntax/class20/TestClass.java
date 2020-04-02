package com.syntax.class20;

public class TestClass {

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.empNumber=123;
		obj.salary=2000;
		obj.getPaid();
		Employee.company="Dominos";
		Employee.work();
		
		ScrumTeam obj1=new ScrumTeam();
		obj1.ceremonies="Daily Stand up";
		obj1.empNumber=1234;
		
		obj1.salary=20000;
		obj1.attendMeetings();
		obj1.getPaid();
		ScrumTeam.company="Any";
		ScrumTeam.work();
		
		Tester obj2=new Tester();
		obj2.ceremonies="Sprint Planning";
		obj2.empNumber=1234;
		obj2.salary=1000;
		obj2.attendMeetings();
		obj2.getPaid();
		obj2.test();
		Tester.company="Hi";
		Tester.work();
		

	}

}
