package com.java.class18_Oct26;
import java.util.Scanner;
public class FindFactorsOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        System.out.println("The factors are: ");
        for(int i = 1; i <= num; i++){
            if(num % i == 0 && num != 0){
                System.out.print(i + " ");
            }
        }
    }
}
