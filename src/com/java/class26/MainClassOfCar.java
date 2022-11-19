package com.java.class26;

public class MainClassOfCar {
    public static void main(String[] args) {
        Car_Object bmw = new Car_Object();
        Car_Object audi = new Car_Object();

        bmw.speed = 200;
        audi.color = "White";

        bmw.drive(); // Driving White car at speed 200
        audi.drive(); // Driving null car at speed 0 -> as we didn't initialized it,
        // it will take values from object it wasn't initialized

        bmw.increaseSpeed(bmw.speed); // 200, bc speed won't be updated when there's a void function

        // First approach
        bmw.speed = bmw.increaseSpeed(bmw.speed); // 700

        // second approach
        audi.decreaseSpeed(bmw); // 500

        // Third approach
        bmw.makeSpeedZero();

        System.out.println(bmw.speed);

        System.out.println(bmw.color); // black
        System.out.println(audi.color); // yellow

    }
}
