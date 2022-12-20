package com.java.class30;

public class Browser {
    void openIncognitoWindow(){
        System.out.println("Ctrl + T");
    }
}

class Chrome extends Browser{
    void openIncognitoWindow(){
        System.out.println("Ctrl + Shift + N");
    }
}

class FireFox extends Browser{
    void openIncognitoWindow(){
        System.out.println("Ctrl + Shift + P");
    }
}
