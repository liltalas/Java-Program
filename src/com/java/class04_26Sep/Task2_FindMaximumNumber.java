package com.java.class04_26Sep;

import java.util.Scanner;

/*
	1. Write a program to take two numbers and print the maximum out of these two
    For example, if num1 is 5 and num2 is 7, the output should be 7
 */
public class Task2_FindMaximumNumber {
    public static void main(String[] args) {

        System.out.println("--------Take two numbers and print the maximum out of these two.--------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter another number: ");
        int num2 = sc.nextInt();

        if (num1 >= num2) {
            System.out.println("The greatest number is " + num1);
        } else if (num1 < num2) {
            System.out.println("The greatest number is " + num2);
        } else {
            System.out.println("Please enter a valid digit!");
        }
    }
}

