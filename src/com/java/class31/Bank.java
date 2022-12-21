package com.java.class31;

public class Bank {
    int balance;
    public void checkBalance(){
        System.out.println(balance);
    }

    public void withdraw(int amount){
        balance = balance - amount;
        System.out.println("Available balance - " + balance);
    }

    // we need this method in the parent class bc otherwise we
    // will need to create separate methods for each child
    // class in PayPal class
    public void displayRateOfInterest(){
        System.out.println("");
    }
}

class ChaseBank extends Bank{

    public void displayRateOfInterest(){
        System.out.println("7.0");
    }
}

class BankOfAmerica extends Bank{

    public void displayRateOfInterest(){
        System.out.println("8.0");
    }
}

class WellsFargo extends Bank{

    public void displayRateOfInterest(){
        System.out.println("6.0");
    }
}
