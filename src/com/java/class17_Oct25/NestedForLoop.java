package com.java.class17_Oct25;
import java.util.Scanner;
public class NestedForLoop {
    public static void main(String[] args) {

        // straight pattern - square

        for (int i = 1; i <= 5; i++) { // outer for loop manages the row

            for (int j = 1; j <= 5; j++) { // inner for loop manages the column

                System.out.print("A");
            }

            System.out.println(); // means enter
        }
        System.out.println();


        // increasing pattern
        for (int i = 1; i <= 5; i++) { // outer for loop manages the row

            for (int j = 1; j <= i; j++) { // inner for loop manages the column

                System.out.print("A");
            }

            System.out.println(); // means enter
        }
        System.out.println();


        // another example - decreasing pattern

        for (int i = 1; i <= 5; i++) { // outer for loop manages the row

            for (int j = 1; j <= 6 - i; j++) { // inner for loop manages the column

                System.out.print("A");
            }

            System.out.println(); // means enter
        }

        System.out.println();


    }
}
