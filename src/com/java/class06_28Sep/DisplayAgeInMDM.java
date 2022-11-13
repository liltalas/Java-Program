package com.java.class06_28Sep;

import java.util.Scanner;

// Write a program  to take age from user in years and display his age in a month, days, and minutes
public class DisplayAgeInMDM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age in years: ");
        int age = sc.nextInt();

        int months = age * 12;
        int days = age * 365;
        double minutes = age * 365 * 24 * 60;

        System.out.println("You have spent " + months + " months on Earth. ");
        System.out.println("You have spent " + days + " days on Earth. ");
        System.out.println("You have spent " + minutes + " minutes on Earth. ");
    }
}
