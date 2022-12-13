package com.java.class28;

public class MainClassCartoons {
    public static void main(String[] args) {
        Cartoons sh = new Cartoons();
        sh.ShrekMainChars("Shrek","Donkey","Fiona");

        NewCharacters nw = new NewCharacters();
        nw.AdditionalChars("Puss in Boots", "Gingerbread Man");
        nw.ShrekMainChars("Donkey", "Fiona", "Shrek");
    }
}
