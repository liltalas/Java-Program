package com.java.class13;

public class main {
    public static void main(String[] args) {


        System.out.println(getMultiplication(10,20));
        System.out.println(call("100"));
        //getMultiplication(10,20);
    }

    static int getMultiplication(int a, int b){
       int result = a * b;
       return result;
        //System.out.println(a*b); return
    }

    static String call(String phonenumber){
        return "Calling..." + phonenumber;
    }

    static void text(String phonenumber, String text){
        System.out.println("Sending text to " + phonenumber);
    }
}
