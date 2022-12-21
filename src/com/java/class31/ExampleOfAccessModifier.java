package com.java.class31;

public class ExampleOfAccessModifier {
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        //System.out.println(b.balance); // private
        System.out.println(b.accName); // public
        System.out.println(b.accNumber); // default
        System.out.println(b.nomineeDetails); // protected
    }
}
