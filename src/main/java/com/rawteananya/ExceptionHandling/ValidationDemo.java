package com.rawteananya.ExceptionHandling;

public class ValidationDemo {

    public void validateAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid Amount");
        } else {
            System.out.println("Valid Amount");
        }
    }
}


