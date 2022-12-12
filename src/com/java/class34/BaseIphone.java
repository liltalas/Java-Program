package com.java.class34;

// Homework
// Whenever you are creating concrete Iphones, ask the user create constructors that ask the user to input model, color, iosversion,
// when creating concrete IPhones like Iphone7, 8 etc., u should ask the user
public class BaseIphone {

    private String model;
    private String color;
    private String iOSVersion;
    private int memoryInMg;

    private String notes;
    private String messages;

    public String writeAMessage(String messages){
        return messages;
    }

    public String writeNote(String note){
        return note;
    }
}
