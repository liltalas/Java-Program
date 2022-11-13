package com.java.class22;

// 1. Write a program to find the sum of even and odd numbers
//         Example
//         Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
//         Output : Sum Of Even - 134, Sum Of Odd - 206

public class Task1_SumOfEvenAndOdd {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for(int i = 0; i < data.length; i++){
            if(data[i] % 2 == 0){
                sumOfEven = sumOfEven + data[i];
            } else{
                sumOfOdd = sumOfOdd + data[i];
            }
        }
        System.out.println("Sum Of Even - " + sumOfEven + ", Sum Of Odd - " + sumOfOdd);
    }
}
