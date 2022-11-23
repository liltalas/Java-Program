package com.java.class29;

// U can call a Constructor from another constructor only
class Bank{
    Bank(){
       // this(10);
        System.out.println("From Bank");
    }

    Bank(int balance){
         this(10, 20.0);
        System.out.println("From Bank " + balance);
    }

    Bank(int a, double b){
        this(b,"Hello");
    }

    Bank(double a, String name){
        this();
    }

}


public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        Bank b = new Bank(548);
    }
}
