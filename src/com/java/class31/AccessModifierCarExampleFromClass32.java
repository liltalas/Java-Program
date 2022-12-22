package com.java.class31;

import com.java.class32.Car;

public class AccessModifierCarExampleFromClass32 {
    public static void main(String[] args) {
        Car c = new Car();
        // to set a new value
        c.setSpeed(500);
        c.price = 432897984;
        System.out.println(c.getSpeed());
    }
}
