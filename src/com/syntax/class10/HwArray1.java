package com.syntax.class10;

public class HwArray1 {
	public static void  main (String[] args) {
		String [] names={"Sabah", "Tarek", "Rana"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		System.out.println("printing using advanced for loop");
		
		for(String name:names) {
			System.out.println(name);
		}
		
		// create an array of fruits and retrieve all elements
		
		String[] fruits= {"Banana", "Kiwi", "Apple", "Mango"};
		// if fruit is apple ---> that is your favorite fruit
		// advanced for loop, enhanced for loop , for each loop
		
		for (String fruit:fruits) {
			
			if(fruit.equals("Apple")) {
				System.out.println(fruit+" is your fevorite fruit");
			}else {
				System.out.println(fruit);
			}
			
			
		}
		
		System.out.println("-------------");
		// regular for loop
		// fruits.length= number of element
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		
	}

}
