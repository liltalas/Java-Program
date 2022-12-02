package com.java.class25;

public class MainClass {
    public static void main(String[] args) {
        // Create and Initialize Object
        Bank acc1 = new Bank();
        Bank acc2 = new Bank();
        Bank acc3 = new Bank(); // third object

        acc1.balance = 1000;
        acc1.accName = "Syrga";

        //System.out.println(acc2.typeOfAccount);  prints null

        acc2.accName = "Guldash";
        acc2.balance = 5000;

        acc3.accName = "Nazima";
        acc3.balance = 6000;
       // acc3.accNumber = 12345678;

        // calling methods
        acc1.deposit(3000);
        acc2.withdraw(4000);
        acc3.deposit(5000);
        acc3.transferMoney(12345678, 5000);

        System.out.println(acc1.balance); // 1000 + 3000 = 4000
        System.out.println(acc2.balance); // 5000 - 4000 = 1000
        System.out.println(acc3.totalBalance); // 11k


    }
}
