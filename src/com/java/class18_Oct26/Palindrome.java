package com.java.class18_Oct26;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        int palindrome = num;

        for(; num != 0; num = num / 10){

            int lastDigit = num % 10; // get the remainder
            //combine last digit with previous value of reverse number
            rev = rev * 10 + lastDigit;
            //removing last digit from the number -> num = num / 10;

        }
        System.out.println(rev);

        if(rev == palindrome){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }

}
