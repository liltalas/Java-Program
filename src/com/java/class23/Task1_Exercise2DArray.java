package com.java.class23;

public class Task1_Exercise2DArray {
    public static void main(String[] args) {
        int data[][] ={{23, 34, 62},
                       {53, 2, 8},
                       {3, 56, 23}
        };

        //prints diagonal values as loop goes
        // [0][0],[1][1],[2][2]
        // output: 23, 2, 23
    for(int i = 0; i < data.length; i++){
        System.out.println(data[i][i] + " ");
        }


    System.out.println("===============");

    // prints all values in the array as outer loop(i) stands for # of rows,
        // and inner loop(j) for column

    for(int i = 0; i < data.length; i++){
        for(int j = 0; j < data.length; j++){
            System.out.print(data[i][j] + " ");
        }
        System.out.println();
    }

    }
}
