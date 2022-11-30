package com.java.class25;

public class MainClassStore {
    public static void main(String[] args) {

        // creating two objects
        Store guest1 = new Store();
        Store guest2 = new Store();

        guest1.customerName = "Syrga";
        guest1.coat = "Winter Puffer Coat";
        guest1.shoe = "North Face";
        guest1.coatPrice = 230;
        guest1.shoePrice = 80;
        guest1.currency = '$';
        guest1.discount = 40;

        guest2.customerName = "Kaniet";
        guest2.coat = "Insulated Thermal Coat";
        guest2.shoe = "Nike";
        guest2.coatPrice = 370;
        guest2.shoePrice = 110;
        guest2.currency = '$';
        guest2.discount = 15;

        // calling methods of the class
        guest1.totalPrice(guest1.coatPrice + guest1.shoePrice);
        guest1.discountedPrice(guest1.discount);

        System.out.println("**********************************************");

        guest2.totalPrice(guest2.coatPrice + guest2.shoePrice);
        guest2.discountedPrice(guest2.discount);
    }

}
