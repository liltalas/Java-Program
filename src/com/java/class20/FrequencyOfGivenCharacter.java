package com.java.class20;

// Write a program to find frequency of given character
// the String

// String - Hello, How are you?
// Character - e
// Output - 2

import java.util.Scanner;
public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String: ");
        String str = sc.nextLine();
        System.out.println("Please enter char: ");
        char target = sc.next().charAt(0);

//        String str = "Hello, How are you?";
//        char target = 'e';
        System.out.println(findFrequencyOfGivenCharacter(str, target));
    }

    static int findFrequencyOfGivenCharacter(String str, char target){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) ==  target){
                count++;
            }
        }


        return count;
    }
}
