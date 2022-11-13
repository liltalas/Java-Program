package com.java.class04_26Sep;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Everyone";
        String str3 = ", dears!";

        int num1 = 10;
        int num2 = 20;
        double d = 10.1;

        // String works perfectly only with + operator

        System.out.println(str1 + " " + str2 + str3); //Concatenation if we don't put space
        System.out.println(str1 + num1); // we can't do operations with strings, instead it will concatenate them all
        System.out.println(str1 + num1 + num2); // if there's no brackets of numbers, it will just concatenate
        System.out.println(num1 + num2 + str1); // bc we go from left to right(add, concat)
        System.out.println(str1 + num1 * num2); // Hello200 since '*' is the first priority
        System.out.println(str1 + num1 + num2 + str2); // concat
       // System.out.println(str1 + num1 - num2); // error, sub (-) operator is not defined with string and int
        // it is also bc of the priority of operators (BEDMAS)
        System.out.println(num1 + "num2"+ str1); // 10num2Hello

    }
}
