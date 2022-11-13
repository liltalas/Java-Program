package com.java.class14;

public class EvenNumbers10_1 {
    public static void main(String[] args) {
        int i = 10;

        while(i >= 1){
            if(i % 2 == 0){ // finding if its even or not
                System.out.println(i);
            }
            i--;
        }
    }
}
