package com.java.class25;

public class Bank {

    // properties of the bank
    String accName;
    String accNumber;
    double balance;
    int routingNumber;
    char typeOfAccount;
    String currency;
    double totalBalance;

    // actions
    void deposit(double amount){

        totalBalance= balance + amount;
    }

    void withdraw(double amount){

        totalBalance = balance - amount;
    }

    void transferMoney(int accNumber, double amount){
        System.out.println("Transferring " + amount + " to " + accNumber);
    }

}
