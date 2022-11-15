package com.java.class24;

public class Print2DArray {
    public static void main(String[] args) {
        int info[][] = {
                {23, 44, 21},
                {45, 42, 31},
                {34, 2, 99}
        };

        // Index based for loop to print all elements in an array
        for(int i = 0; i < info.length; i++){
            for(int j = 0; j < info[i].length; j++){
                System.out.print(info[i][j] + " ");
            }
            System.out.println();
        }

        // Another approach using - For each loop
        for(int row[] : info){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
