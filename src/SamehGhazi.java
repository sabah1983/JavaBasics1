import java.util.Scanner;

public class SamehGhazi {
	public static void main(String[] args) {
		Scanner name=new Scanner (System.in);
		
		System.out.println("Please enter first name");
	
		String firstName=name.nextLine();
		System.out.println("Please enter sur name");
		String surName=name.nextLine();
		System.out.println(firstName+" "+surName);
		
	}

}
