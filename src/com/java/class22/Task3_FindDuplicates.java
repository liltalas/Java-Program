package com.java.class22;

//  3. Write a program to find all duplicates number from the array (Tricky, do enough brainstorming before solving)
//          Example
//          Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
//          Output : Duplicate numbers - 23, 44

public class Task3_FindDuplicates {
    public static void main(String[] args) {
        int data[] = {23, 44, 21, 23, 27, 35, 75, 44, 25};
        //length -1 bc there is no any number to compare after the last element
        for (int i = 0; i < data.length - 1; i++) {

            // we use 'i + 1'  bc it needs to start comparing from the next index
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    System.out.println(data[i]);
                }
            }
        }
    }
}
