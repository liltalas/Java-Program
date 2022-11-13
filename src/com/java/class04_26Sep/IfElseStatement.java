package com.java.class04_26Sep;

public class IfElseStatement {
    public static void main(String[] args) {

       boolean b = true;

//       if(b == true){
//           System.out.println("1");
//       }else{
//           System.out.println("2");
//       }

        // another example

        System.out.println("1");
        if(b){
            System.out.println("2");
        } else{
            System.out.println("3"); // it will not execute "3" as condition is "2" true
        }
        System.out.println("4");
    }
}
