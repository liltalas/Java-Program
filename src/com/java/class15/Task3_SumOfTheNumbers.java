package com.java.class15;

// Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
public class Task3_SumOfTheNumbers {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i <= 10; i++){
            if(i % 3 == 0){
                sum1 = sum1 + i;}
            else{
                sum2 = (sum2 + i);
            }
        }
        System.out.println(sum2 - sum1); // subtract sum1 bc numbers divisible by 3 were given as a negative
    }
}
