package com.syntax.class22;

public class AnimalTest {
	
	public static void main(String[] args) {
	//non primitive casting :upcasting
	Animal obj=new Tiger();
	
	obj.sleep();
	obj.eat();
	//obj.run();The method run() is undefined for the type Animal
	
	System.out.println("----------- Accessing methods using parent class");
    Animal animal=new Animal();
    //methods only of parent class will be available 
    animal.eat();
    animal.sleep();
    
    System.out.println("----------- Accessing methods using child class");
    Tiger tiger=new Tiger();
    tiger.sleep();
    tiger.eat();
    tiger.run();
	}

}
