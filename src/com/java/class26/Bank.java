package com.java.class26;

public class Bank {
    // properties of the bank
    String accName;
    String accNumber;
    double balance;

    Bank(String accNameFromUser, int balFromUser){
        accName = accNameFromUser;
        balance = balFromUser;
        accNumber = accName + balance;
    }

    Bank(){
        // initialize the object variables above
        System.out.println("This is hi from Constructor");
    }

    // actions
    void deposit(double amount){
        balance = balance + amount;
    }

    void withdraw(double amount){
        balance = balance - amount;
    }

   void displayPersonalDetails(){
       System.out.println(balance);
       System.out.println(accName);
       System.out.println(accNumber);
}
}
