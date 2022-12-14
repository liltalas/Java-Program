package com.java.class29;

// U can call a Constructor from another constructor only
// u can call a Constructor from another constructor,
// but it has to be called in the first line only
class Bank{
    Bank(){
        this(10); // passing the parameter to this keyboard using the parentheses calls the constructors
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
//        this(); - will be looping and therefore, it shows an exception
    }

}


public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        Bank b = new Bank();
    }
}
