package com.java.class06_28Sep;

import java.util.Scanner;

// Write a program to get three numbers from user and find average of these numbers
public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

        double average = (num1 + num2 + num3)/(3.0); // to get a decimal result use as 3.0

        System.out.println(average);

    }

}
