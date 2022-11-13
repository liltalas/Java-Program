package com.java.class04_26Sep;

import java.util.Scanner;

// Write a program to take one number and print whether it is divisible by 5 or not
public class Task1_Divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // get the input

        if (num % 5 == 0 && num / 5 != 0){
            System.out.println(num + " is divisible by 5. ");
        }else{
            System.out.println(num + " is not divisible by 5. ");
        }



    }
}
