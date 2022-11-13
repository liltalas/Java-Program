package com.java.class16;

/* Write a program to find factors of the given number
    Input - 6
    Output - 1 2 3 6
 */
import java.util.Scanner;
public class Task4_FindFactorsOfTheNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("The factors of " + num + " are: ");
        for(int i = 1; i <= num; i++){
            if(num % i == 0){ // number that has no remainder after division will be its factor
                System.out.print(i +" ");
            }
        }
    }
}
