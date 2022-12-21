package com.java.class30;

import com.java.class31.Bank1;

public class ExampleOfAccessModifierProtected extends Bank1{
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        //System.out.println(b.balance); // private
        System.out.println(b.accName); // public
       // System.out.println(b.accNumber); // default
        System.out.println(nomineeDetails); // protected

        // we can't use instance variable in the static method
    }
}
