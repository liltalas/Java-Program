package com.java.class16;

import java.util.Scanner;

public class FindLengthOfTheNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = 0;
        while(num != 0){ // 0 - ketmen, while - combain, num - buudai
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
