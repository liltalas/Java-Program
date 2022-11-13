package com.java.class17_Oct25;

import java.util.Scanner;

public class HalfRhombic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num / 2 + 1; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("A");
            }
            System.out.println();
        }

        for(int i = 1; i < num / 2 + 1; i++){
            for(int j = 1; j <= num / 2 + 1 - i; j++){ // j <= 5 - i
                System.out.print("A");
            }
            System.out.println();
        }

        System.out.println();
    }

}
