package com.java.class19;
import java.util.Scanner;
public class Hwk3_DiamondInNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of rows: ");
        int num = sc.nextInt();
        /*
                    1
                   000
                  11111
                 0000000
                111111111
                 0000000
                  11111
                   000
                    1
         */

        // Upper triangle

        for(int row = 1; row <= 5; row++){

            for(int sp = 1; sp <= 5 - row; sp++){
                System.out.print(" ");
            }

            for(int col = 1; col <= row * 2 - 1; col++){
                System.out.print(row % 2);
                // same condition
//                if(row % 2 == 0){
//                    System.out.println(0);
//                } else{
//                    System.out.println(1);
//                }
            }
            System.out.println();
        }

        // Lower triangle

        for(int row = 1; row <= 4; row++){

            for(int sp = 1; sp <= row; sp++){
                System.out.print(" ");
            }
            for(int col = 1; col <= 9 - 2 * row; col++){
                System.out.print((row + 1) % 2);
            }
            System.out.println();
        }
    }
}
