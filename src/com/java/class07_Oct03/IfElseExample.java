package com.java.class07_Oct03;
import java.util.Scanner;

// Write a program to get two numbers from user and print maximum number
public class IfElseExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt(); // entered value by the user is stored in a variable num1

        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        if(num1 >= num2){
            System.out.println("The maximum number is " + num1);
        }else{
            System.out.println("The maximum number is " + num2);
        }
    }
}
