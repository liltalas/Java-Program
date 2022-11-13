package com.java.class20;

/*  Java program to print initials of a name
    Write a program to take the full name from the user and print the first letter
    of the first name and last name

        Example
            Input - Thomas Joe
            Output  - T.J
            Another Example
            Input - Charlie Kyle
            Output - C.K
 */

//import java.util.Scanner;
//public class Task1_FL {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter First name and Last Name: ");
//        String str = sc.nextLine();
//        System.out.println("Initials: ");
//
//        printFirstLetterOfFL(str);
//    }
//
//    static void printFirstLetterOfFL(String str){
//        if(str.length() == 0){
//            return;
//
//            // Since toupper() returns int,
//            // we do typecasting
//            System.out.print(Character.toUpperCase(str.charAt(0)));
//
//            // Traverse rest of the string and
//            // print the characters after spaces.
//            for (int i = 1; i < str.length() - 1; i++)
//                if (str.charAt(i) == ' ')
//                    System.out.print(" " + Character.toUpperCase(
//                            str.charAt(i + 1)));
//        }
//
//
//    }
//}
import java.util.Scanner;
class Task1_Initials {

    static void printFirstLetterOfFL(String str)
    {
        if (str.length() == 0)
            return;

        // Since toupper() returns int,
        // we do typecasting
        System.out.print(Character.toUpperCase(
                str.charAt(0)));

        // Traverse rest of the string and
        // print the characters after spaces.
        for (int i = 1; i < str.length() - 1; i++)
            if (str.charAt(i) == ' ')
                System.out.print("." + Character.toUpperCase(
                        str.charAt(i + 1)));
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter First name and Last Name: ");
        String str = sc.nextLine();
        System.out.println("Initials: ");

        printFirstLetterOfFL(str);
    }
}
