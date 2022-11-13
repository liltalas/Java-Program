package com.java.class06_28Sep;

public class TypeCastingExample {
    public static void main(String[] args) {

     // casting one character into another
        //  we use it to change the values inside the program
        double x = 10, y = 20;
        int result;
        result = (int) (x / y); // casting double to int
        System.out.println(result);


        // another example
        System.out.println("============= another example ==============");
        double d = 2.5;
        int a = 10;
        short s = 20;
        byte b = 100;

        int num = (int)d; // num = 2
        double d1 = num;  // 2.0
        double d2 = a;    // 10.0
        b = (byte) s; // cast to byte -> b = 20

        System.out.println(num);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b);
    }
}
