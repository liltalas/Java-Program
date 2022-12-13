package com.java.class28;

// Create parent class of your choice and create child class of your choice and create MainClass
// In the MainClass create object of child & access all the members of parent class using object of child class
public class Cartoons {

    public void ShrekMainChars(String char1, String char2, String char3){
        System.out.println("Main Characters of 'Shrek': ");
        System.out.println(char1 + " " + char2 + " " + char3);
    }

}

class NewCharacters extends Cartoons{

    public void AdditionalChars(String char4, String char5){
        System.out.println("Additional sweet characters: ");
        System.out.println(char4 + " " + char5);
    }
}
