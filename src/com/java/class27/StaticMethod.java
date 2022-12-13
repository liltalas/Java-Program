package com.java.class27;

class Bike{ // class is a design, therefore, it doesn't have a space
   static int speed;
   int price; // memory will be created when we create an object of a class ; it won't work without object

    static void method1(){
        System.out.println(speed);
    }
}


public class StaticMethod {
    public static void main(String[] args) {
        Bike.speed = 10;
        Bike.method1();
    }
}
