package com.syntax.class15;

public class Palindrome {
	  void palindrome(String word) {
	        boolean f=true;
	        String reverse="";
	        String x=word.replaceAll("[^A-Za-z]", "");
	        for (int i=word.length()-1; i>=0; i--) {
	            reverse=reverse+x.charAt(i);
	             
	            if (word.equals(reverse)) {
	            f=true;
	            } else {
	              f=true;
	            }
	            
	         }
	         System.out.println(f);
	            
	    }
    public static void main(String[] args) {
		
    	Palindrome word1=new Palindrome();
    	 word1.palindrome("Madam");
	}

}
