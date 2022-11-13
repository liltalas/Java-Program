package com.java.class14;

// 3. Write a Java program to Print Pattern 1 10 2 9 3 8 4 7 5 6
public class task3_PrintPatternOfNumbers {
    public static void main(String[] args) {

        // initialize two values as we split the pattern into two
       int a = 1;
       int b = 10;

       while(a <= 5 && b > 5){ // a <= 5 will focus on incrementing bc the pattern of 1 is increasing till 5
           System.out.print(a + " ");
           a++;

           System.out.print(b + " "); // b > 5 processes decrementing operator as the value b is decreasing from 10 to 6
           b--;
       }

    }
}
