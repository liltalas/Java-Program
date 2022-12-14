package com.java.class29;


class Vehicle {
    int speed = 50;

    void drift(){
        System.out.println("Drifting Car");
    }
}
// this - it refers to current class object
class Car extends Vehicle {
    int speed = 100;

    void drift(){
        int speed = 200;
        System.out.println(speed); // 200 - local variable
        System.out.println(this.speed);// 100 - current class variable
        System.out.println(super.speed); // 50 - parent class variable
       // drift(); // The process of calling the function itself (Line 15) called Recursion
        super.drift();
    }
}
public class ThisAndSuperExample {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.speed); // prints current class variable
        c.drift();
    }
}
