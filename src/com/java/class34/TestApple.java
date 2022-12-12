package com.java.class34;

public class TestApple {
    public static void main(String[] args) {
        BaseIphone iPhone = new TouchIdIPhones();
        IPhone7 iPhone7 = new IPhone7();//("Iphone7, 532, ", "black");
        System.out.println(iPhone7.touchId("JJAA"));
        //System.out.println(whichIphone(iphoneModel));
    }

    // to take an Iphone object and return a model
    // method has to take all type of Iphone
    public static String whichIphone(String iphoneModel){
        BaseIphone b;

        return iphoneModel;
    }
}
