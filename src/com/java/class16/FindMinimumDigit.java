package com.java.class16;


// Write a program to print greatest digit from an entered number
import java.util.Scanner;
    public class FindMinimumDigit {
        public static void main(String[] args) {
            System.out.println("Please enter a number: ");
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            // separate digits from the number using modulo 10
            int count = 0;
            int min = num % 10;
            while(num != 0){
                int lastdigit = num % 10; // remainder will be lastdigit
                if (lastdigit < min){
                    min = lastdigit;
                }
                num = num / 10;
                count++;
            }
            System.out.println(count);
            System.out.println("Minimum digit is " + min);
        }
    }


