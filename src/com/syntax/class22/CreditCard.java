package com.syntax.class22;

public class CreditCard {
	
	int balance;
	double interest;
	
	public CreditCard(int balance) {
		this.balance=balance;
		
	}
	
	double getinterest() {
		if(balance<500) {
			interest=balance*0.4;
		}else {
			interest=0;
		}
		return interest;
	}

}
class Visa extends CreditCard{
	public Visa(int balance) {
		super(balance);
	}
	double getinterest() {
		if(balance<500) {
			interest=balance*0.4;
		}else {
			interest=0;
		}
		return interest;
	}
}
class AX extends CreditCard{
	public AX(int balance) {
		super(balance);
	}
	double getinterest() {
		if(balance<500) {
			interest=balance*0.6;
		}else {
			interest=0;
		}
		return interest;
	}
}
