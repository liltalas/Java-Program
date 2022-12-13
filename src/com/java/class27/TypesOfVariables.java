package com.java.class27;

// Types of variables:
/*
    1) local variable - created inside the method, for, if, u have to initialize before using it; short lifetime
    class variable:
    2) instance variable - available with object, # of copies regarding number of object we are creating
    3) static - available with class, single copy regardless how many objects we create
    both of these have default value
 */

class Bank{
    int balance = 50;

    public void method1(){
        int balance = 40;
        System.out.println(balance);
    }
}


public class TypesOfVariables {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.balance);
        b.method1();
        b.method1();
        System.out.println(b.balance);
    }
}
