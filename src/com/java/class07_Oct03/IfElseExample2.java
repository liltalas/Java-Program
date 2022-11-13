package com.java.class07_Oct03;

import java.util.Scanner;

// Write a program to take age from user and print weather they are
// eligible for driving license or not
public class IfElseExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = sc.nextInt();

        if(age >= 16){
            System.out.println("You are eligible for Driving License. ");
        }else{
            System.out.println("Unfortunately, you are not eligible for Driving License! ");
        }

    }
}
