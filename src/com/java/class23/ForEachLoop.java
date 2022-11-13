package com.java.class23;

public class ForEachLoop {
    public static void main(String[] args) {
        int data[] = {23, 34, 20, 45, 23, 34, 10};

        // Printing all elements of array using index based for loop
        // Iterating / traversing
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }

        // Print all elements of array using for each loop/ enhance for loop
        for(int num: data){
            System.out.println(num);
        }
    }
}
