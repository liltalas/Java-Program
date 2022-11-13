package com.java.class05_27Sep;

public class Task1_StringOutput {
    public static void main(String[] args) {
        String str1 = "Hello", str2 = "Java";
        int i = 10, j = 20;

        System.out.println(i + j);              // 30
        System.out.println("i + j");            // i + j -> as they r inside of the quotation mark
        System.out.println(str1 + i);           // Hello10
        System.out.println(str1 + i + j);       // Hello1020 -> bc it has started with a string from the left
        System.out.println(i + j + str1);       // 30Hello
        System.out.println(str1 + i * j);       // Hello200
       // System.out.println(str1 + i - j);       // invalid
        System.out.println(str1 + i + str2);    // Hello10Java


    }
}
