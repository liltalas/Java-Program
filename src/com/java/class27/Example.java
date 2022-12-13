package com.java.class27;

//Constructor - initialize class variable

// Rules of Constructor
/*
        1) It has same name as class name
        2) it must not have return type
        3) It'll get executed automatically when we create object from the class

        Types of constructor

        1) Default Constructor -  created by java automatically when we are not creating any constructor in the class
        2) No arg Constructor -  created by user,  without parameter
        3) Parameterized Constructor - created by user, having number of parameters

        // constructor won't get called when object is not created
 */
class Car{

    //int numOfCars; -> it will get automatically initialized to a default value 0
    // nonstatic variable creates memory for each object
    static int numOfCars; // design variables are static ; no need to call or create object variable
    // directly can use the class name
    // it won't create separate copies for each object (fam income) -> memory is fixed
    Car(){
        numOfCars++; // incrementing the value
    }
}

public class Example {
    public static void main(String[] args) {
        Car toyota = new Car();
        Car bmw = new Car();
        Car audi = new Car();

        System.out.println(toyota.numOfCars);
    }
}
