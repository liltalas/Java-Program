package com.java.class16;

import java.util.Scanner;

/* Write a program to print sum of each digit from the given number
    Input - 43634
    Output - 20
 */
public class Task1_SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while(num != 0){
            int lastdigit = num % 10; // get the remainder
           sum = sum + lastdigit; //  add and store the remainder of each digit till the loop finishes
           num = num /10;
        }
        System.out.println("The sum of the given number is " + sum);
    }
}
