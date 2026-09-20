package com.rawteananya.OOPs.Interface_Demo;

public interface Payment_interface {
    void processPayment(); // abstract method

    default void paymentStatus(){
        System.out.println("Payment status checked");
    }
    }
