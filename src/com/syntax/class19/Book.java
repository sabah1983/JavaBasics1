package com.syntax.class19;

public class Book {
	

    public Book() {
		System.out.println("I love this book");
	}
    public Book(String str) {
		this();
		System.out.println("I have two books");
	}
    
    public static void main(String[] args) {
		
    	Book obj=new Book("Book");
    	
	}
    
    

}
