package com.java.class21;

// write a program to print length of the String
// without using .length() function
import java.util.Scanner;
public class FindLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name = sc.nextLine();


        int i = 0;
        for(char c: name.toCharArray()) {
            i++;
        }
        System.out.println("Length of the given string : "+i);

        // another approach
        int count = 0;

        while(!name.isEmpty()){
            count++;
            name = name.substring(1);
        }
        System.out.println("Length: " + count);
    }
}
