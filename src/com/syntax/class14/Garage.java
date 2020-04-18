package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		// build individual objects
		Car car1=new Car();
		car1.make="Lamborghini";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Blue";
		
		System.out.println(car1.make);
		//accessing behavior/methods of car with car1
		car1.accelerate();
		car1.makeNoise();
		car1.drive();
		car1.stop();
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="m5";
		car2.year=2019;
		car2.color="Pink";
		
		//accessing behavior/methods of car with car2 
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
		
		//print car2
		System.out.println(car2.make);
		
		Car car3=new Car();
		car3.make="123";
		car3.speed=200;
		
		//car2.breaking();
		//CE method is not defined in class
		
		//print I drive pink BMW
		System.out.println("I drive "+car2.color+" "+car2.make);
		
		Car2 anotherCar=new Car2();
		anotherCar.make="Toyota";
		anotherCar.speed=90;
		anotherCar.drive();
		
		// creat bike object
		
		//new Bike();-->can't create object
		//if we don't have class

	}

}
