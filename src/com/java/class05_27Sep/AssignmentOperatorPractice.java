package com.java.class05_27Sep;

public class AssignmentOperatorPractice {
    public static void main(String[] args) {
        int a = 10, b = 15;

        a = a * a; // a = 10 * 10 = 100
        b = a * b; // b = 100 * 15 = 1500

        b = a + b; // b = 100 + 1500 = 1600
        a = a + b; // a = 100 + 1600 = 1700

        System.out.println(a);
        System.out.println(b);
    }
}
