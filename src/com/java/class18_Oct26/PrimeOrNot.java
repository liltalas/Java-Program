package com.java.class18_Oct26;

// Write a program to find whether the given number is prime or not
import java.util.Scanner;
public class PrimeOrNot {
        public static void main(String[] args) {
            System.out.println("Please enter a number: ");
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            int count = 0;
            for(int i = 1; i <= num; i++){
                if(num % i == 0) {// number that has no remainder after division will be its factor
                    System.out.println(i);
                    count++;
                }

            }
            if(count == 2){
                System.out.print(num + " is a Prime number");
            } else{
                System.out.println(num + " is not a Prime number");
            }
    }

}
