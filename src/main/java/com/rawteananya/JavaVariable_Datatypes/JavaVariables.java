package com.rawteananya.JavaVariable_Datatypes;

public class JavaVariables {
    public static void main(String[] args) {

        String name = "Ananya";
        int age = 26;
        double salary = 100000.00;
        char grade = 'A';
        boolean isTester = true;
        int testcases = 1000;


        System.out.println("Name :- " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Grade :" + grade);
        System.out.println("isTester :" + isTester);
        System.out.println("Testcases :" + testcases);

        // 1. Widening int → double
        double ageInDouble  = age;
        double testCasesInDouble  = testcases;

        System.out.println("Age as double: " + ageInDouble);
        System.out.println("Test cases as double: " + testCasesInDouble);

        // 2. Narrowing double -> int
        int salaryInInt = (int) salary;
        System.out.println("Salary as int: " + salaryInInt);

        // 3. String → int Convert:-"50" → 50
        String number = "50";
        int convertedNumber = Integer.parseInt(number);
        System.out.println("Converted number: " + convertedNumber);

    }
}
