package com.java.class12;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printLineWithEqual(); // method call
        //System.out.println("=================================");
        System.out.println("Welcome to the Calculator");
        //System.out.println("=================================");
        printLineWithEqual(); // method call


        printLineWithHyphen(); // method call
        //System.out.println("----------------------------------");
        System.out.println("Please enter first number");
        //System.out.println("----------------------------------");
        printLineWithHyphen(); // method call
        int num1 = sc.nextInt();

        printLineWithHyphen();// method call
        // System.out.println("----------------------------------");
        System.out.println("Please enter second number");
        // System.out.println("----------------------------------");
        printLineWithHyphen(); // method call
        int num2 = sc.nextInt();

        printLineWithEqual();
        System.out.println("Here is your addition: "+(num1+num2));
        //System.out.println("==================================");
        printLineWithEqual();
    }

    // name of the method - printlineWithEqual
    // Return type - void
    // Parameter - ()
    // Method Body - {inside of it}
    static void printLineWithEqual(){
       System.out.println("=================================");
//        for(int i=0; i<length; i++){
//            System.out.println("=");
//        }
//        System.out.println();
    }

    static void printLineWithHyphen(){
        System.out.println("----------------------------------");
    }
}
