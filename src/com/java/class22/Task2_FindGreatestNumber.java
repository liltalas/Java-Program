package com.java.class22;

//. Write a program to find greatest number from an array
//        Example
//        Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
//        Output : Maximum - 75
public class Task2_FindGreatestNumber {
        public static void main(String[] args) {
            int data[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
            int max = 0; // initializing and assigning value to the variable to store a new value
            for(int i = 0; i < data.length; i++){
                if(data[i] > max){ // compares every element with current max
                    max = data[i];
                }
            }
            System.out.println(max);
        }
    }

