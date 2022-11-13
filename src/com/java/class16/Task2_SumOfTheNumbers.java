package com.java.class16;

// Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
public class Task2_SumOfTheNumbers {
    public static void main(String[] args) {
        System.out.println("========== Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5 ==========");

        int sum = 0;
        for(int i = 1; i <= 10; i++){
            if(i <= 5){
                sum = sum + i;
                /* if the questions was 10 - 1 + 9 - 2 + 8 - 3 + 7 - 4 + 6 - 5,
                     we would use -i, and the result would be 25
                 */
            } else {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
