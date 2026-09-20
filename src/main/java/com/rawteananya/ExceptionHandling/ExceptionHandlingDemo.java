package com.rawteananya.ExceptionHandling;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Execution completed");
        }

        System.out.println("Program continues");
    }
}