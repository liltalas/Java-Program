package com.java.class34;

import java.util.Arrays;

public class TestApple {
    public static void main(String[] args) {
       BaseIphone ip7 = new TouchIdIPhones("Iphone7", "white", "8", 512);
       BaseIphone ip8 = new TouchIdIPhones("Iphone8", "Black", "8", 512);

       System.out.println(whichIphone(ip7));
        System.out.println(whichIphone(ip8));

        BaseIphone deviceId1 = new BaseIphone("Iphone7", "Black", "16.0",512);
        BaseIphone deviceId2 = new BaseIphone("Iphone8", "Silver", "14.0",256);
        BaseIphone deviceId3 = new BaseIphone("Iphone10", "Gold", "15.0",156);
        BaseIphone deviceId4 = new BaseIphone("Iphone8", "Matte", "15.0",512);

        // printing out iOSVersion of deviceId1
        // getters help us to check
        System.out.println(deviceId1.getiOSVersion());
        // setters help to update the value
        deviceId2.setiOSVersion("16.0");
        System.out.println(deviceId2.getiOSVersion());

        BaseIphone[] allIphones = new BaseIphone[4];
        allIphones[0] = deviceId1;
        allIphones[1] = deviceId2;
        allIphones[2] = deviceId3;
        allIphones[3] = deviceId4;

        update(allIphones);
        System.out.println(Arrays.toString(allIphones));
    }

    // to take any Iphone object and return a model
    // method has to take all type of Iphone and return a model
    public static String whichIphone(BaseIphone baseIphone){

        return baseIphone.getModel();
    }

    // create a static method that takes an array of all types of Iphones and finds all iphones
    // with an iOSVersion that is not 16.0 and updates them to 16.0
    public static void update(BaseIphone[] baseIphones){
        for(int i = 0; i < baseIphones.length; i++){
            if(!baseIphones[i].getiOSVersion().equals("16.0")){
                baseIphones[i].setiOSVersion("16.0");
            }
        }
    }

}
