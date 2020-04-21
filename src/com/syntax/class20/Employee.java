 package com.syntax.class20;

public class Employee {
	
	public static String company;
	protected int empNumber;
	double salary;
	private long ssn;
	
	void getPaid() {
		System.out.println("Employee gets paid "+salary);
	}
	static void work() {
		System.out.println("Employee works at "+company);
	}

}

class ScrumTeam extends Employee{
	String ceremonies;
	
	void attendMeetings() {
		System.out.println("ST attend all "+ceremonies);
	}
}

class ProductOwner extends ScrumTeam{
	void prioritizeBacklog() {
		System.out.println("Any");
	}
}

class ScrumMaster extends ScrumTeam{
	void navigateTeam() {
		
	}
}
class Developer extends ScrumTeam{
	void coding() {
		
	}
}
class Tester extends ScrumTeam{
	void test() {
		
	}
}
class BussinessAnalyst extends ScrumTeam{
	void workWithRequirements() {
		
	}
}