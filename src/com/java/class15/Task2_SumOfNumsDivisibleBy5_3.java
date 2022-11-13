package com.java.class15;

// Write a Java program to print the sum of 1 to 50 numbers
// which are divisible by 5 or by 3

public class Task2_SumOfNumsDivisibleBy5_3 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 50; i++){
            if(i % 5 == 0 || i % 3 == 0){ // checking the divisibility of nums by 5 or 3
                sum = sum + i; // store the new value after addition
            }
        }
        System.out.println(sum);
    }
}
