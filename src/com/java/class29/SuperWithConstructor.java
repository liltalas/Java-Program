package com.java.class29;

class Bank1{


//    Bank1(){
//         this(10);
//        System.out.println("From Bank");
//    }

    // Constructor of parent class
    Bank1(int balance){

        System.out.println("From Bank " + balance);
    }

}

class CityBank extends Bank1{
    // Constructor of child
    CityBank(int a, double b){
        super(a);
        System.out.println("I still have double values " + b);
    }
    CityBank(){
        super(500);
    }
}

public class SuperWithConstructor {
    public static void main(String[] args) {
        CityBank b = new CityBank();
    }

}
