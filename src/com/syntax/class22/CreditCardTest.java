package com.syntax.class22;

public class CreditCardTest {
	
	public static void main(String[] args) {
		
		CreditCard cd=new CreditCard(350);
		double interest=cd.getinterest();
		System.out.println(interest);
		
		Visa vi=new Visa(350);
		interest=vi.getinterest();
		System.out.println(interest);
		
		AX ax=new AX(350);
		interest=ax.getinterest();
		System.out.println(interest); 
	}

}
