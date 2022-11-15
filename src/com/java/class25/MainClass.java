package com.java.class25;

public class MainClass {
    public static void main(String[] args) {
        // Create and Initialize Object
        Bank acc1 = new Bank();
        Bank acc2 = new Bank();

        acc1.balance = 1000;
        acc1.accName = "Syrga";

        //System.out.println(acc2.typeOfAccount);  prints null

        acc1.accName = "Guldash";
        acc2.balance = 5000;

        acc1.deposit(3000);
        acc2.withdraw(4000);

        System.out.println(acc1.balance); // 1000 + 3000 = 4000
        System.out.println(acc2.balance); // 5000 - 4000 = 1000

    }
}
