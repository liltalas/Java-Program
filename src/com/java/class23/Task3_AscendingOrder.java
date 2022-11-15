package com.java.class23;

public class Task3_AscendingOrder {
    /*
    3. Program to sort the elements of an array in ascending order (Tricky, do enough brainstorming before solving)
Example
Input : 5, 2, 8, 7, 3, 6
Output : Ascending Order - 2, 3, 5, 6, 7, 8
     */

    public static void main(String[] args) {

        int data[] = {5, 2, 8, 7, 3, 6}; // declaring & initializing

        for(int i = 0; i < data.length - 1; i++){
            int ascendingOrder = 0;
            for(int j = i + 1; j < data.length; j++){

                if(data[i] > data[j]){           // 5 > 2 -> true, so if statement continuous
                    ascendingOrder = data[i];    // ascending order = 5
                    data[i] = data[j];           // data[j] was equal to 2 and it will assign data[i] to be 2
                    data[j] = ascendingOrder;    // data[j] will be assigned as 5

                    // as a result, numbers will swap as an ascending order
                }
            }

        }
        System.out.println("Ascending order of numbers: ");
        for(int num: data){
            System.out.print( num + " ");
        }

    }
}
