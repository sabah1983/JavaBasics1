package com.syntax.class22;

public class Degree {
	
	void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}
}

class Bachelors extends Degree{
	void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}
}

class Masters extends Degree{
	void getPrerequisite() {
		System.out.println("To get a degree you need a bachelor degree");
	}
}
