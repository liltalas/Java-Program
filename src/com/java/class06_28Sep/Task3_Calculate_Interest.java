package com.java.class06_28Sep;
import java.util.Scanner;
/*
    Task 2. Write a program to get principle, rate of interest and
     number of years from the user and calculate simple interest
 */
public class Task3_Calculate_Interest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your principal amount: ");
        double Principal = sc.nextDouble();

        System.out.println("Please enter your rate of interest: ");
        double IntrRate = sc.nextDouble(); // we use double as the amount might be in decimals

        System.out.println("Please enter the number of years: ");
        int year = sc.nextInt();

        double SimpleInterest = (Principal * IntrRate * year);

        System.out.println("Your Simple Interest is " + SimpleInterest);
    }
}
