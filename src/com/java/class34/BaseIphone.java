package com.java.class34;

// Homework
// Whenever you are creating concrete Iphones, ask the user to input model, color, iosversion in the constructors
// when creating concrete IPhones like Iphone7, 8 etc., u should ask the user
public class BaseIphone {

    // declaring Parameters of a class
    private String model;
    private String color;
    private String iOSVersion;
    private int memoryInMg;

    // constructors that initialize all parameters
   public BaseIphone(String model, String color, String iOSVersion, int memoryInMg){
        this.model = model;
        this.color = color;
        this.iOSVersion = iOSVersion;
        this.memoryInMg = memoryInMg;
   }

   // getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getiOSVersion() {
        return iOSVersion;
    }

    public void setiOSVersion(String iOSVersion) {
        this.iOSVersion = iOSVersion;
    }

    public int getMemoryInMg() {
        return memoryInMg;
    }

    public void setMemoryInMg(int memoryInMg) {
        this.memoryInMg = memoryInMg;
    }

    // overriding the toString method
    // bc it already extends default object class

    @Override
    public String toString() {
        return "BaseIphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", iOSVersion='" + iOSVersion + '\'' +
                ", memoryInMg=" + memoryInMg +
                '}';
    }
}
