package com.java.class14;

public class EvenNumber1_20 {
    public static void main(String[] args) {
        int num = 1;

//      while(num <= 20){
//          if(num % 2 == 0) {
//              System.out.println(num);
//          }
//          num++;
//      }
         // Another Approach
         num = 1;
         while(num <=20){
             num++;
             System.out.println(num);
             num++;
         }
    }
}
