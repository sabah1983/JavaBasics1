package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
        /*TODO First Work
         Write a program that will read three inputs of scores:
         1. quiz, 2. mid term, 3. final scores.
         And determine the grade based on the following rules:
                if the average score >= 90
                --> grade = A
                if the average score >= 70 && < 90
                --> grade = B
                if the average score >= 50 && < 70
                --> grade = C
                if the average score < 50
                --> grade = F   
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your quiz score");
        double quiz = input.nextInt();
        System.out.println("Enter your mid term score");
        double midTerm = input.nextInt();
        System.out.println("Enter your final score");
        double finalScores = input.nextInt();
        double averageScore = quiz + midTerm + finalScores / 3;
        if(averageScore > 90) {
                System.out.println("Your average score is : " + averageScore + ", and grade is A");
        }else if (averageScore >= 70 && averageScore < 90) {
                System.out.println("Your average score is : " + averageScore + ", and grade is B");
        }else if (averageScore >= 50 && averageScore < 70) {
                System.out.println("Your average score is : " + averageScore + ", and grade is C");
        }else {
                System.out.println("Your average score is : " + averageScore + ", and grade is F");
        }
}

}