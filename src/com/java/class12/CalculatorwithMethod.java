package com.java.class12;

import java.util.Scanner;

public class CalculatorwithMethod {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter first number");
            int num1 = sc.nextInt();

            System.out.println("Please enter second number");
            int num2 = sc.nextInt();

            System.out.println("Please enter your operation: ");
            String operation = sc.next();

            switch (operation.toLowerCase()){
                case "add":
                case "+":
                    //System.out.println(num1 +  num2);
                    add(num1, num2);
                    break;

                case "sub":
                case "-":
                    //System.out.println(num1 -  num2);
                    sub(num1, num2);
                    break;

                case "mul":
                case "*":
                    //System.out.println(num1 *  num2);
                    mul(num1, num2);
                    break;

                default:
                    System.out.println("Please choose right operation");
            }
        }
        static void add(int num1, int num2){
            System.out.println(num1+num2);
        }

        static void sub(int num1, int num2){
            System.out.println(num1-num2);
        }

        static void mul(int num1, int num2){
            System.out.println(num1*num2);
        }
    }
