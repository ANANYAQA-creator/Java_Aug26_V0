package com.rawteananya.Operators;

public class JavaOperators {
    public static void main (String[] args){

        // PART 1

        int a = 20;
        int b =6;

        System.out.println(a+b); //26
        System.out.println(a-b); // 14
        System.out.println(a*b); // 120
        System.out.println(a/b); // 3
        System.out.println(a%b); // 2

       // Part 2 — Comparison

        System.out.println(a > b) ; // true
        System.out.println( a < b); // false
        System.out.println( a == b); // false
        System.out.println( a != b); // true

       // Part 3 — Logical

        int age = 26;
        boolean isTester = true;

        // && And
        if( age >18 && isTester ){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        // || or
        if( age >30 || isTester ){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        // ! NOT
        if ( !isTester){
            System.out.println(" User is not QA");
        }

        // Part 4 — Increment
        int c = 20;
        int d =6;

        System.out.println(c++); //20
        System.out.println(++c); // 22
        System.out.println(d--); // 6
        System.out.println(--d); //4

        // Part 5 — Ternary

       boolean testPassed = true;
        String result= testPassed ? "PASS" : "FAIL";
        System.out.println(result); //PASS

        //Part 6 — String comparison

        String browser = "Chrome";
        if (browser.equals("Chrome")){
            System.out.println("Browser Supported");
        }else {
            System.out.println("Not Browser Supported");
        }
    }
}
