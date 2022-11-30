package com.java.class25;

public class MainClassStore {
    public static void main(String[] args) {

        // creating three objects
        Store guest1 = new Store("S", "Z", 40, 230);
        Store guest2 = new Store("K", "OS", 15, 370);
        Store administrator = new Store("Welcome to our store! ");


       // guest1.customerName = "S";
        guest1.coat = "Winter Puffer Coat";
        guest1.shoe = "North Face";
       // guest1.coatPrice = 230;
        guest1.shoePrice = 80;
        guest1.currency = '$';
        guest1.discount = 40;

        //guest2.customerName = "K";
        guest2.coat = "Insulated Thermal Coat";
        guest2.shoe = "Nike";
       // guest2.coatPrice = 370;
        guest2.shoePrice = 110;
        guest2.currency = '$';
        // guest2.discount = 15;

        // calling methods of the class
        guest1.totalPrice(guest1.coatPrice + guest1.shoePrice);
        guest1.discountedPrice(guest1.discount);
        guest1.buyTwoGetOneFree("socks"); // won't get executed due to the if stmt

        System.out.println("**********************************************");

        guest2.totalPrice(guest2.coatPrice + guest2.shoePrice);
        guest2.discountedPrice(guest2.discount);
        guest2.buyTwoGetOneFree("Jacket");
    }

}
