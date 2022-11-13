package com.java.class06_28Sep;

import java.util.Scanner;

/*
    Task 3.  Write a program to take total bill amount and discount percentage
    from user and print value of final bill amount after discount.
 */
public class Task2_Bill_Amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Total bill amount: ");
        double totalbillamount = sc.nextDouble();

        System.out.println("Discount percentage: ");
        double discountpercent = sc.nextDouble();

        double finalbill = totalbillamount - ((totalbillamount * discountpercent)/100);

        System.out.println("The Final Bill Amount is " + finalbill);
    }
}
