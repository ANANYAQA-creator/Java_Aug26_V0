package com.rawteananya.Operators;

public class LogicalOperators {
 public static void main(String[] args) {

    int age =26;
    boolean isTester = true;

    // && AND operator : both condition must be true
    if(age >18 && isTester ){
        System.out.println("Test Passed");
    }

    // || OR Atleast one condition must be true
     String browser = "Chrome";
     if (browser.equals("Chrome") || browser.equals("Firefox")) {
         System.out.println("Supported browser");
     }else {
         System.out.println("Unsupported Browser");
     }

     // ! — NOT Reverses a boolean value.

     boolean isLoggedIn = false;
     if (!isLoggedIn) {
         System.out.println("User is not logged in");
     }
    // false becomes true when ! is applied.

     String browser1 = "Chrome";
     if (!browser1.equals("Chrome") || browser1.equals("Firefox")) {
         System.out.println("Supported browser");
     }else {
         System.out.println("Unsupported Browser");
     }


}
}