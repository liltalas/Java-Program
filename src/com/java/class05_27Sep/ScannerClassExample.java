package com.java.class05_27Sep;

import java.util.Scanner;
public class ScannerClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int a = sc.nextInt();

        System.out.println("Please enter second number: ");
        int b = sc.nextInt();


        System.out.println(a + b);
        System.out.println(" Sum of two numbers is: " + (a + b));
    }
}
