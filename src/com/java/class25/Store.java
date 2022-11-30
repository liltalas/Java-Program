package com.java.class25;
// 1st task
//  Create your own class with your example and have properties and methods inside the class
//       Create a MainClass with the main method and use your own class to create an object, and perform
//       some operations (call methods of the class)
// 2nd task
//  create three constructors in your class that is
//  taking different parameters and create three objects
//  in the MainClass using these constructors

public class Store {

    // properties of store
    String customerName;
    String customerLastName;
    String coat;
    String shoe;
    double coatPrice;
    double shoePrice;
    double totalPrice;
    double discount;
    char currency;

    // 1st constructor
    public Store(String name, String lastName, double payLess, double winterCoatPrice){
        customerName = name;
        customerLastName = lastName;
        discount = payLess;
        coatPrice = winterCoatPrice;

    }

    // 2nd constructor
    public Store(String announcement){
        coat = announcement;
        System.out.println(announcement);
        System.out.println();
    }

    // methods/ actions
     void totalPrice(double price){

        totalPrice = totalPrice + price;
        System.out.println(customerName + " " + customerLastName + "'s total bill for the items: " + currency + totalPrice);
        System.out.println("Items bought: \n" + coat + " " + currency + coatPrice + ";\n"
                 + shoe + " " + currency + shoePrice + ";");
    }

     void discountedPrice(double discountPrice){
        discountPrice = totalPrice - ((totalPrice * discount) / 100);
        System.out.println("After Discount: " + discountPrice);

    }

    void buyTwoGetOneFree(String freeItem){
        if(totalPrice >= 400){
            System.out.println("You got a free gift: " + freeItem);
        }
    }

}
