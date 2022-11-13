package com.java.class20;

public class CountNumberOfSpaces {
    public static void main(String[] args) {
        String str = "Hello User, How are you?";

        System.out.println(getNumberOfSpaces(str));
    }
    static int getNumberOfSpaces(String str){


        int count = 0;

        // has to be less than str length, bc there's no any character
        // in the last index, it will result an error
        for(int i = 0; i < str.length(); i++){
            //System.out.print(str.charAt(i)); -> prints all character
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
}
