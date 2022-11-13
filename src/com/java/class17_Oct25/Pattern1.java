package com.java.class17_Oct25;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of rows: ");

        /* display the pattern below
                 A
                AA
               AAA
              AAAA
             AAAAA
         */

        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){ // # of rows

            // firstly, we need space
            for(int sp = 1; sp <= num - i; sp++){ // i + sp = 5, relation between them
                System.out.print(" ");
            }

            // letters in a column
            for(int j = 1; j <= i; j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
