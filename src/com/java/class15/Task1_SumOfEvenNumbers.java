package com.java.class15;

// Task 1 - Write a Java program to print the sum of even numbers from 1 to 10
public class Task1_SumOfEvenNumbers {
    public static void main(String[] args) {

        int sum = 0;

            for(int num = 1; num <= 10; num++){
                if(num % 2 == 0) { // to identify if its even or not
                    sum = sum + num; // store the new value in sum each time it loops
                }
            }
            System.out.println(sum); // display the result when the loop has stopped
    }

}
