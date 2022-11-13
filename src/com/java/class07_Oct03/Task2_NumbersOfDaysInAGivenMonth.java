package com.java.class07_Oct03;

/* 2. Write a program to print the number of days in a given month
    Example1
    input is 3
    output is 31 days
    Example2
    Input is 2
    output is 28 days
*/
import java.util.Scanner;
public class Task2_NumbersOfDaysInAGivenMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a month in a number: ");
        int month = sc.nextInt();

        if(month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("This month has 30 days");
        } else if(month == 2){
            System.out.println("This month has 28 days");
        } else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
            System.out.println("This month has 31 days");
        } else{
            System.out.println("Please enter a valid input! ");
        }

    }

}
