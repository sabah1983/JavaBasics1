package com.syntax.class20;

public class Doctor {
	
	int doctorId;
	String name;
	
	public Doctor(String name, int doctorId) {
		this.name=name;
		this.doctorId=doctorId;
	}
}

class Dentist extends Doctor {
	
	String cert;
	Dentist(String name, int doctorId, String cert){
		//compiler will try to make call to parent class constructor super();
		super(name, doctorId);
		this.name=name;
		this.doctorId=doctorId;
		this.cert=cert;
	}
	
	public void display() {
		System.out.println("My doctor name is "+name+" and his id is "+doctorId);
	}
}