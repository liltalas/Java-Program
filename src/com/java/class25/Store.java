package com.java.class25;

//  Create your own class with your example and have properties and methods inside the class
//       Create a MainClass with the main method and use your own class to create an object, and perform
//       some operations (call methods of the class)
public class Store {

    // properties of store
    String customerName;
    String coat;
    String shoe;

    double coatPrice;
    double shoePrice;
    double totalPrice;
    double discount;
    char currency;

    // methods/ actions
    void totalPrice(double price){

        totalPrice = totalPrice + price;
        System.out.println(customerName + "'s total bill for the items: " + currency + totalPrice);
        System.out.println("Items bought: \n" + coat + " " + currency + coatPrice + ";\n"
                 + shoe + " " + currency + shoePrice + ";");
    }

    void discountedPrice(double discountPrice){
        discountPrice = totalPrice - ((totalPrice * discount) / 100);
        System.out.println("After Discount: " + discountPrice);

    }

}
