package com.java.class31;

public class PayPal {

//    public void checkBalance(ChaseBank cb){
//       cb.checkBalance();
//    }
//
//    public void checkBalance(BankOfAmerica BoFa){
//        BoFa.checkBalance();
//    }
//
//    public void checkBalance(WellsFargo wf){
//        wf.checkBalance();
//    }

    public void checkBalance(Bank b){
      b.checkBalance();
    }


    void displayInterest(Bank b){
        b.displayRateOfInterest();
    }
}
