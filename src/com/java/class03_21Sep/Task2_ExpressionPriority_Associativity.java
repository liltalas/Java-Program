package com.java.class03_21Sep;

// Find the output of below expressions
public class Task2_ExpressionPriority_Associativity {
   public static void main(String args[]){

       System.out.println(12 + 8 / 3 + 4 / 2 - 3); // 13 cz decimals aren't accepted
       System.out.println(16 * 10 / (1 + 4) / 2 * 3); // 48 -> BEDMAS rule applies
       System.out.println(2 * 4 * (3 + 4) / (2 * 3)); // 9 cz decimals aren't accepted
       System.out.println(5 * 2 / 10 + 6 / 6 * 6); // 7
   }
}
