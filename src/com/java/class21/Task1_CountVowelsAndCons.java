package com.java.class21;

/*
 Java Program to count the total number of vowels and consonants in a string

    Example
        Input - Today is Saturday
        Output - Total Vowels - 6, Total Consonants -  9
 */
import java.util.Scanner;
public class Task1_CountVowelsAndCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");

        String str = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    ||  str.charAt(i) == 'o' ||  str.charAt(i) == 'u' || str.charAt(i) == 'y'){
                vowels++;
            } else{
                consonants++;
            }
        }
        System.out.println("Total Vowels: " + vowels + "," + " Total Consonants: " + consonants);
    }

}
