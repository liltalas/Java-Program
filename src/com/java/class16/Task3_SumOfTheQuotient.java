package com.java.class16;

//  Java program to find result of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
public class Task3_SumOfTheQuotient {
    public static void main(String[] args) {
        System.out.println("============== Java program to find result of 1/2 + 2/3 + 3/4 + 4/5 +......10/11 ===========");
        double sum = 0;

        for (int num = 1; num <= 10; num++) {

            if (num % 2 == 1) {

                //  we use type casting as we need to convert an int to double
                sum = sum + (double)num / (num + 1); // add it to the sum if num is odd
            }
            else {
                sum += (double)num / (num + 1); // add it to the sum if num is even
            }
        }

        // Print the sum
        System.out.print("The result is " + sum +"\n");
    }
}
