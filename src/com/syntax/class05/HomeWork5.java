package com.syntax.class05;

import java.util.Scanner;

public class HomeWork5 {
	public static void main(String[] args) {
        /* TODO 2
         Write a program to find largest number among three numbers using nested if
         provided by a user (numbers must be distinct)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1 >= num2) {           
             if(num1 >= num3) {
                /* This will only execute if conditions given in both
                 * the if blocks are true, which means num1 is greater
                 * than num2 and num3
                 */
                System.out.println(num1+" is the largest Number");
             }else {
               /* This will only execute if the condition in outer if
                 * is true and condition in inner if is false. which
                 * means num1 is grater than num2 but less than num3.
                 * which means num3 is the largest
                 */
                System.out.println(num3+" is the largest Number");
           }
        }
        else {             
             if(num2 >= num3) {
                /* This will execute if the condition in outer if is false
                 * and inner if is true which means num3 is greater than num1
                 * but num2 is greater than num3. That means num2 is largest
                 */
                System.out.println(num2+" is the largest Number");
             } else {
                /* This will execute if the condition in outer if is false
                 * and inner if is false which means num3 is greater than num1
                 * and num2. That means num3 is largest
                 */
                System.out.println(num3+" is the largest Number");
           }
        }
    }

}
