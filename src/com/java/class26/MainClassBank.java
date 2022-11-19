package com.java.class26;

public class MainClassBank {
    public static void main(String[] args) {
        Bank acc1 = new Bank("Syrga ", 4000);
        Bank acc2 = new Bank("Kaniet ", 5000);
        Bank acc3 = new Bank("Guldash ", 2000);

        Bank acc4 = new Bank();

        System.out.println(acc1.accNumber);
        System.out.println(acc2.accNumber);
        System.out.println(acc3.accNumber);

    }
}
