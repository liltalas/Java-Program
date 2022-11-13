package com.java.class21;

// output:  agryS
import java.util.Scanner;
public class FindReverseOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name = sc.nextLine();

        char target;
        String revname = "";
        for(int i = name.length() - 1; i >= 0; i--){
            target = (name.charAt(i));
            revname = revname + target;
        }
        System.out.println(revname);

        // another approach
        for(int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(4-i));
        }
    }
}
