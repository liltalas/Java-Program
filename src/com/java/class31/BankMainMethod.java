package com.java.class31;

public class BankMainMethod {
    public static void main(String[] args) {
        ChaseBank koAccCB = new ChaseBank();
        BankOfAmerica koBoFa = new BankOfAmerica();
        WellsFargo koWf = new WellsFargo();

//        koAccCB.displayRateOfInterest();
//        koAccCB.checkBalance();
//
//        koBoFa.displayRateOfInterest();
//        koBoFa.withdraw(500);
        PayPal pp = new PayPal();
        pp.displayInterest(koAccCB);
        pp.displayInterest(koBoFa);
        pp.displayInterest(koWf);


    }
}
