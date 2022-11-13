package com.java.class13;

public class code {
    public static void main(String[] args) { // m
        printValue(getSquareOfNumbers(10));
    }
    static int getSquareOfNumbers (int a){ // userdefined method
        return getMultiplication(a - a,a + 5);
    }
    static int getMultiplication(int a, int b){ // userdefined method
        return a * b;
    }

    static void printValue(int num){// we are creating a variable each time when we have a
        System.out.println(num);
    }
}
