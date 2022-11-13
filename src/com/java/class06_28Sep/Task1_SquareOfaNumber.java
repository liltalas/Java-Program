package com.java.class06_28Sep;

import java.util.Scanner;

// Task 1. Write a program to get a number from user and print square of given number
public class Task1_SquareOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int num = sc.nextInt();

        System.out.println(num*num); // multiply by itself to find the square of a number
    }
}
