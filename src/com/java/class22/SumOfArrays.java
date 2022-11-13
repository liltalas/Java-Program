package com.java.class22;

// Write a program to find sum of the elements stored in the array

public class SumOfArrays {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 34, 45, 23, 45, 23}; // initializing and assigning values

        int sum = 0; // to store sum of the elements in the array

        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.print(sum);
    }
}
