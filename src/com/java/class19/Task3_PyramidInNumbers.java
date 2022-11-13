package com.java.class19;

public class Task3_PyramidInNumbers {
    public static void main(String[] args) {
        /*
                     1
                    123
                   12345
                  1234567
                 123456789
         */

        for(int i = 1; i <= 5; i++){
            for(int sp = 1; sp <= 5 - i; sp++){ // # of space
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++){System.out.print(j); // print column
            }
            System.out.println();
        }
    }
}
