package com.java.class07_Oct03;
import java.util.Scanner;

// 1. Write a program to print a given number that is positive, negative, or zero
public class Task1_PosNegOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        double num = sc.nextDouble();

        if (num >= 0) { // outer condition
            if (num == 0) { // inner condition
                System.out.println("Given number is Zero! "); // display when both con1 & con2 are true
            }else{
                    System.out.println("Given number is Positive! "); // display when con1 is true and con2 is false
                }
            } else {
            System.out.println("Given number is Negative! "); // display when both cons are incorrect
        }

        }
    }

