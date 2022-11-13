package com.java.class08_Oct04;

import java.util.Scanner;

// Task1: Write a program to take number from user and print if it's divisible by 5 or not
public class Task1_DivisibleBy5OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

        if(num % 5 == 0){
            System.out.println(num + " is divisible by 5.");
        } else{
            System.out.println(num + " is not divisible by 5.");
        }
    }
}
