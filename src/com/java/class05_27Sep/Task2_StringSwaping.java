package com.java.class05_27Sep;

import java.util.Scanner;

/*
    Write a program to take two String from the user using the Scanner class
    and Swap the values of two variables

 */
public class Task2_StringSwaping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String name = sc.next();

        System.out.println("Please enter your lastname: ");
        String lastname = sc.next();
        String str3;

        str3 = lastname; // c = b
        lastname = name; // b = a
        name = str3;     // a = c


        System.out.println(name);
        System.out.println(lastname);
    }
}
