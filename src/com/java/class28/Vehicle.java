package com.java.class28;

class Factory { // has to go by order, parent will be displayed first
    Factory(){
        System.out.println("1.From Factory");
    }
}
 class Vehicle extends SportsCar { // only the class name can be public
    Vehicle(){
        System.out.println("2.From vehicle");
    }
}



class SportsCar extends Factory {
    SportsCar(){
        System.out.println("3.From SportsCar");
    }
}

class Car extends SportsCar{
    Car(){
        System.out.println("4.From Car");
    }
}
