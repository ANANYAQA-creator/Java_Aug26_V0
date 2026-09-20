package com.rawteananya.OOPs.Interface_Demo;

public class CreditCardPayment implements Payment_interface {
    @Override
    public void processPayment(){
        System.out.println("Processing Credit Card Payment");
    }
}
