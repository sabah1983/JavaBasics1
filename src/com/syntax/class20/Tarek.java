package com.syntax.class20;

public class Tarek {
	  public static void main(String[] args) {
		  
		  Tarek n=new Tarek("Tarek", "Abdelsattar");
		  n.Name();
		
	}
	  
	  
	String name, lastName;
	
	public Tarek(String name, String lastName) {
		
		this.name=name;
		this.lastName=lastName;
	}
	 public void Name() {
		 System.out.println("My name is "+name+" "+lastName);
	 }
	

}

class Son extends Tarek{

	public Son(String name, String lastName) {
		super(name, lastName);
	}
	
	

}

    
