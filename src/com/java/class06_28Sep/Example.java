package com.java.class06_28Sep;

public class Example {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int result;
        result = a / b * a; // 10/20 * 10 = 0
        a = a * b; // 10 * 20 = 200
        b = a * b; // 200 * 20 = 4000

        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        // can't replace a value in a double into of integer; error
//        double c = 10, d = 20;
//        int res;
//        res = c / d; // (int)(c / d)
//        System.out.println(res);
    }
}
