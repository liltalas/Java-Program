package com.java.class26;

public class Car_Object {
    int speed = 300; // object variable - permanent
    String color = "red";


    void drive(){
            System.out.println("Driving " + color + " car at speed " + speed);
        }
//   void increaseSpeed(int speed){ // speed variable is only available in the method
//       speed = speed + 500; // it increases, but not utilize it
//   }

    // pass by value
    int increaseSpeed(int speed){ // local variable is temporary
        // prints 700 as we are returning the variable
        speed = speed + 500; // we can now utilize it
        return speed;
    }

    // pass by reference
    void decreaseSpeed(Car_Object myCar){ // we are passing bmw to myCar
        myCar.speed = myCar.speed - 200;
        myCar.color = "Black";
        color = "Yellow";
    }

    void makeSpeedZero(){
        speed = 0;
    }
}
