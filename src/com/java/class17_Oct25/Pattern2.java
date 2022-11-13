package com.java.class17_Oct25;
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of rows: ");
        /*
                   *
                 * * *
               * * * * *
             * * * * * * *
           * * * * * * * * *

         */

        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            for(int sp = 1; sp <= num - i; sp++){
                System.out.print(" ");
            }


            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("A");
            }
            System.out.println();


        }


    }
}

