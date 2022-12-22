package com.java.class32;

public class Car {
  // no one should access ur data variables directly
   private int speed;
   private String color;
   public int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(){
        System.out.println("From car Constructor");
    }

    // need to create a public method to utilize the data
    // variables from different package
    // getters
    public int getSpeed(){
        return speed;
    }
    // Setters
    public void setSpeed(int amount){
        // All your logic to identify the transaction log
        this.speed = speed; // to pass local variable into
        // instance variable
    }
    // why we need getters and setters?
    // Because you can control the validation inside the methods
}
