package com.rawteananya.Operators;

public class TernaryOperator {
    public static void main(String[] args){

        // Syntax : condition ? valueIftrue : valueIfFalse;

        int age = 26;
        String result = age >= 18 ? "Adult" : "Minor";
        System.out.println(result); //Adult

        boolean testPassed = true;
        String status = testPassed ? "PASS" : "FAIL";
        System.out.println(status); // PASS
    }
}
