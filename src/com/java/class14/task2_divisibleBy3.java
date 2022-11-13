package com.java.class14;

// 2. Write a program to print numbers from 1 to 20 which are divisible by 3
public class task2_divisibleBy3 {
    public static void main(String[] args) {
        int num = 1;

        while(num <= 20){
            if(num % 3 == 0){ //it is divisible by 3 when the dividing number by three has a remainder of zero.
                System.out.println(num);
            }
            num++; // incrementing the value that keep the looping till it reaches the max amount allowed
        }
    }
}
