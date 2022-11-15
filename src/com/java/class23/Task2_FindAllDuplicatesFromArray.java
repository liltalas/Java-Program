package com.java.class23;
// 2. Write a program to find all duplicates number from the array
// (Implement this program to get unique numbers in the output)
//Example
//Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
//        Output : Duplicate numbers - 23, 44, 35
public class Task2_FindAllDuplicatesFromArray {
    public static void main(String[] args) {

        // declaring and initializing the data array
        // length of the array - 11, index -> 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        int data[] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};

        // in outer for loop, "i" is visiting each element of the array from index[0] to index [10]
        // variable 'i' remembers the values of each element we visited
        // and goes to inner for loop if the condition is true
        for(int i = 0; i < data.length - 1; i++){

            // declaring and initializing(assigning a value) a new variable "count-keeper" for the # of duplicates we find
            int countDuplicates = 0;

            // in inner for loop, 'j' is visiting every next element starting from index[1]
            // the relationship between 'i' and 'j'
            /*
                i | j
                0 | 1
                1 | 2
                2 | 3
                3 | 4

             */
            for(int j = i + 1; j < data.length; j++){

                // comparing the elements in an array
                if(data[i] == data[j]){
                    countDuplicates++;
                }
            }

            // if we find at least 1 duplicate, then we will print value of the element,
            // at the index of which we found
            if(countDuplicates == 1){
                System.out.print(data[i] + " " );
            }

        }

    }
}
