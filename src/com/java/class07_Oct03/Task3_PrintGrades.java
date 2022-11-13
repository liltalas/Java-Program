package com.java.class07_Oct03;

/* Write a program to take marks from the user and print grades as follow

Mark is between 90 to 100, then print A+
Mark is between 80 to 89, then print A
Mark is between 70 to 79, then print B+
Mark is between 60 to 69, then print B
Mark is between 50 to 59, then print C+
Mark is between 40 to 49, then print C
 */

import java.util.Scanner;
public class Task3_PrintGrades {
    public static void main(String[] args) {

        // get the data from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student's mark: ");
        double mark = sc.nextDouble();

        // use conditions to find out grades of the students
        if(mark >= 90 && mark <= 100){
            System.out.println("Your grade is 'A+'. ");
        } else if(mark >= 80 && mark <= 89){
            System.out.println("Your grade is 'A' .");
        } else if(mark >= 70 && mark <= 79){
            System.out.println("Your grade is 'B+' .");
        } else if(mark >= 60 && mark <= 69){
            System.out.println("Your grade is 'B' .");
        } else if(mark >= 50 && mark <= 59){
            System.out.println("Your grade is 'C+' .");
        } else if(mark >= 40 && mark <= 49){
            System.out.println("Your grade is 'C' .");
        } else if(mark < 40){
            System.out.println("Sorry, you have failed! Try again. ");
        } else{
            System.out.println("Please enter a mark between 40 to 100. ");
        }

    }
}
