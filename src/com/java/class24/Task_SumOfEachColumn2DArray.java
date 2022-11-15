package com.java.class24;
/*
    2. Write a program to print the sum of each COLUMN from a 2D array
Example
Array:
{23, 44, 21},
{45, 42, 31},
{73, 14, 0}
Output : Duplicate numbers - 141, 100 ,52

 */
public class Task_SumOfEachColumn2DArray {
    public static void main(String[] args) {

        // Initializing
        int data[][] = {
                {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}
        };


        //Calculates number of rows and columns present in given matrix
       int rows = data.length;
       int cols = data[0].length;
        System.out.println("Print sum of each rows in an array: ");

        // Sum Of Each Row in an array
        for(int i = 0; i < rows; i++){
            int sumOfEachRow = 0;
            for(int j = 0; j < cols; j++){
                sumOfEachRow = sumOfEachRow + data[i][j];

            }
            System.out.print(sumOfEachRow + " " );
        }

        // Sum of Each Column in an Array
        System.out.println();
        System.out.println("=======================================");
        System.out.println("Print sum of each columns in an array: ");

        for(int i = 0; i < cols; i++){
            int sumOfEachColumn = 0;
            for(int j = 0; j < rows; j++) {
                sumOfEachColumn = sumOfEachColumn + data[j][i];
            }
            System.out.print(sumOfEachColumn + " " );
        }
    }
}
