package com.java.class23;

public class TwoDimensionArray {
    public static void main(String[] args) {
        // declaration of 2D array
        int data[][];

        // declaration and initialization of 2D array
        int nums[][] = new int[3][5];

        // declare and assign in one line (new array, not relevant to the statement above)
        int info[][] = {{12, 34, 2}, {87, 34, 56}, {23, 92, 4}};

        // find number of rows in the array
        System.out.println(nums.length);

        // find number of columns in a row
        System.out.println(nums[1].length);

        //print data at particular index
        System.out.println(info[2][1]); // result: 92

        // print all data from array using index based for loop

        for(int i = 0; i < info.length; i++){
            for(int j = 0; j < info.length; j++){
                System.out.print(info[i][j] + " ");
            }
            System.out.println();
        }
    }
}
