package com.syntax.class12;

public class StringManpulationsMore {

	public static void main(String[] args) {

    System.out.println("----Substring() function---");
    
    String str="Today is a rainy day";
    String partialString=str.substring(6);//start from 6 untill the end of string
    System.out.println(partialString);
    
    //rainy day
    partialString=str.substring(11);
    System.out.println(partialString);
    
    //Today
    partialString=str.substring(0,5);// start from 0 end at index 5
    System.out.println(partialString);
    
    //rainy
    partialString=str.substring(11,16);
    System.out.println(partialString);
    

	}

}
