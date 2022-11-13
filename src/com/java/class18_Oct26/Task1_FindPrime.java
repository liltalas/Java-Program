package com.java.class18_Oct26;

// Write a program ot print prime numbers from 1 to 100
public class Task1_FindPrime {
    public static void main(String[] args) {
        for(int i = 11; i <= 100; i++){
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }

    }

    static boolean isPrime(int num){
        int divisor = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                divisor++;
            }
        }
        if(divisor == 2){
            return true;
        } else{
            return false;
        }
    }


}
