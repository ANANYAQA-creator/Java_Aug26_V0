package com.rawteananya.Operators;

public class Relational_Comparison_Operator {
    public static void main(String[] args){

        int age = 26;
        System.out.println(age > 18);   // true
        System.out.println(age < 18);   // false
        System.out.println(age == 26);  // true
        System.out.println(age != 26);  // false

       // Selenium example
        int actualCount = 10;
        int expectedCount = 10;

        if (actualCount == expectedCount) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        }
    }