package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		
		int num=200;
		num=num+300;
		System.out.println(num);//500
		num=num-100;
		System.out.println(num);//400
		
		//compound shorthand assinment operators
		num-=100;//num=num-100
		System.out.println(num);//300
		
		num+=50;//num=num+50
		System.out.println(num);//350
		
		num/=7;//num=num/7
		System.out.println(num);//50
		
		num*=10;//num=num*10
		System.out.println(num);//500
		
		num%=5;//num=num%5
		System.out.println(num);//0
		

	}

}
