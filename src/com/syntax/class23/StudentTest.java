package com.syntax.class23;

public class StudentTest {
	
	public static void main(String[] args) {
		System.out.println("--------Student object and Reference Student type");
		Student student=new Student();
		student.study();
		student.doHomework();
		
		System.out.println("--------SyntaxStudent object and Reference SyntaxStudent type");
		SyntaxStudent syntax=new SyntaxStudent();
		syntax.study();
		syntax.doHomework();
		syntax.getjob();
		syntax.accessParentOverridenMethod();
		
		System.out.println("--------SyntaxStudent object and Reference Student type");
		Student st=new SyntaxStudent();//upcasting
		st.doHomework();
		st.study();
		//SyntaxStudent st1=new Student();downcasting 
		
		System.out.println("--------CollegeStudent object and Reference CollegeStudent type");
		CollegeStudent college=new CollegeStudent();
		college.study();
		college.doHomework();
		college.attend();
		
		System.out.println("--------SchoolStudent object and Reference SchoolStudent type");
		SchoolStudent school=new SchoolStudent();
		school.study();
		school.doHomework();
	}

}
