package com.java.class15;

import java.util.Scanner;

public class Sumof1to5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers from 1 to 5: ");
        int num1 = sc.nextInt(); // input number from user
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        getsumof5();
    }

    static void getsumof5() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of these 5 numbers is " + sum);
    }
}
