package com.java.class34;

public class ToStringTest {
    public static void main(String[] args) {
        BaseIphone deviceId1 = new BaseIphone("Iphone7", "Black", "16.0",512);
        //System.out.println -> by default call toString method of an object
        System.out.println(deviceId1);
    }
}
