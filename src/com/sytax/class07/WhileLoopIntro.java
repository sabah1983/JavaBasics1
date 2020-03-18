package com.sytax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time=10;
		if (time<12) {
			System.out.println("Good Morning");
		}
            System.out.println("----------While Loop ----------");
            
           // while (time<12) {
            //	System.out.println("Good Morning");//code will execute infinetely
           // }
            while (time<=12) {
            	
            	System.out.println("Good Morning");
            	time++;
            }
            
            //how to print numbers from 1 to 50?
            int num=1;
            while (num<=50) {
            System.out.println(num);
            num++;
            }
            //how to print numbers from 20 to 30
            int num1=20;
            while(num1<=30) {
            	System.out.println(num1);
            	num1++;
            }
            System.out.println("***********************");
            // how yo print numbers from 5 to 15 all in one line
            
            int num2=5;
            while (num2<=15) {
            	System.out.print(num2+" ");
            	num2++;
            }
            System.out.println("*************************");
            // how to print values from 10 to 1?
            int num3=10;
            while (num3>=1) {
            	System.out.println(num3);
            	num3--;
            }
            //how to print 50 to 1
            int num4=50;
            while(num4>=1) {
            	System.out.println(num4);
            	num4--;
            }
            // how to print odds numbers from 1 to 20
            int num5=1;
            while(num5<20) {
            	System.out.println(num5);
            	num5+=2;
            }
            
	}

}
