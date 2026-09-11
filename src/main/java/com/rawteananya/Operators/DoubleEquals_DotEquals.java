package com.rawteananya.Operators;

public class DoubleEquals_DotEquals {
    public static void main (String[] args){

        // For primitive datatype like int,double using ==
        int a = 10;
        int b = 10;
        System.out.println(a==b);

        // For String using .equal
        String browser = "Chrome";
        if (browser.equals("Chrome")){
            System.out.println("Matched");
        } else {
            System.out.println("Not Matched");
        }
    }
}
