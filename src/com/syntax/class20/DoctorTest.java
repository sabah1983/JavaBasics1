package com.syntax.class20;

public class DoctorTest {

	public static void main(String[] args) {
		
		Doctor doc=new Doctor(null, 0);
		
		Dentist den=new Dentist("Jen", 1234,"hi");
		
		//Dentist.display();CE Cannot make a static reference to the non-static 
		//method display() from the type Dentist

		den.display();
	}

}
