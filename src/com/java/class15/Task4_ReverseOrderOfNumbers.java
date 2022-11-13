package com.java.class15;

// Write a program to print each digit of the number
// into a separate line in reverse order

import java.util.Scanner;

public class Task4_ReverseOrderOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print each digit of the number into a separate line in reverse order");
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

//        while(num != 0){
//            System.out.println( num % 10);
//            num = num / 10;
//        }

        // another approach
        for(;num != 0; num = num / 10){
            System.out.println(num % 10);
        }

    }
}
