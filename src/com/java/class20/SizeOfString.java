package com.java.class20;

// Write a program to take String from user using scanner class
// Count the number of spaces from the string
// Print String is small if number of spaces less than 5
// Print String is medium if number of spaces
// greater than or equal to 5 and less than 10
// Print String is large if number of spaces greater than 10

import java.util.Scanner;
public class SizeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String: ");
        String str = sc.nextLine();


        System.out.println(getSizeOfString(str));

        int count = getSizeOfString(str);
        if(count < 5){
            System.out.println("String is small");
        } else if(count >= 5 && count < 10){
            System.out.println("String is medium");
        } else if(count > 10){
            System.out.println("String is large");
        } else{
            System.out.println("Invalid input");
        }
    }
    static int getSizeOfString(String str){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        return count;
    }
}
