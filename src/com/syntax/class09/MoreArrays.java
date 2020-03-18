package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
     // arrays are fixed in size
		// if we add more values then we declared -->java.lang.ArrayIndexOutOfBoundsException:
      String[] students=new String[3];
      students[0]="Tarek";
      students[1]="Sabah";
      students[2]="Sameh";
     // students[3]="Aaron";
      //System.out.println(students[3]);// can't add more array when you run more the elements we have get error
     // java will give error  java.lang.ArrayIndexOutOfBoundsException: 
      
      // if we store less elements than we declared
      // compiler will add default values
      String[] inClassStudents=new String[5];
      inClassStudents[0]="Sabah";
      inClassStudents[1]="Rana";
     System.out.println(inClassStudents[2]);
	}

}
