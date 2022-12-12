package com.java.class34;

public class TouchIdIPhones extends BaseIphone{
public boolean touchId(String fingerPrint){
    if(fingerPrint.equalsIgnoreCase("Java")){
        return true;
    }
    else return false;
    }
}
