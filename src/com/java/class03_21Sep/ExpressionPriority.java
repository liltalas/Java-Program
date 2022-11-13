package com.java.class03_21Sep;

public class ExpressionPriority {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 6;

        int result = c/a*c; // answer = 12
        int result2 = c + b / a * c + b; // answer = 8
        int result3 = 10/5*8/4-20/5/4+1; // answer = 4
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
