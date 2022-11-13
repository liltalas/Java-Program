package com.java.class23;

public class SumOfArrayElementsUsingForEachLoop {
    public static void main(String[] args) {
        int data[] = {23, 34, 20, 45, 23, 34, 10};

        int sum = 0;
        // Traversing - printing all elements of array
        for(int num: data){
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
