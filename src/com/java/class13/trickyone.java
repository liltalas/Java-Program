package com.java.class13;

public class trickyone {

    // first 'a' inside the main method, and another 'a' is inside the userdefined method
    public static void main(String[] args) {
        int a = 10;
        changeValue(a); // there need to always be a variable to store the data that it can print out later
        //changeValue(a); // 15
        System.out.println(a); // it will print out first 'a' in the box
    }
    static void changeValue(int a){
        a = a + 5;
       // return a;
    }
}

