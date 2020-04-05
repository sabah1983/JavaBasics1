package com.syntax.class21;

public class UserClass {
	
	String name;
	int mobileNumber;
	
	public UserClass(String name, int mobileNumber) {
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
}

class UserInfo extends UserClass {
	
	String address;
	public UserInfo(String name, int mobileNumber, String address) {
		super(name, mobileNumber);
		this.address=address;
		System.out.println("my name is "+name+" and my phone number is "+mobileNumber+" my address is "+address);
	}
}
