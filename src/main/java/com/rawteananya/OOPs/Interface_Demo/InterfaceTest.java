package com.rawteananya.OOPs.Interface_Demo;
public class InterfaceTest{

    public static void main(String[] args){

        Payment_interface payment = new CreditCardPayment();
        /*This demonstrates:

Payment_interface → reference type
CreditCardPayment → actual object
Interface reference can refer to an implementing class
Runtime polymorphism*/
        payment.paymentStatus();
        payment.processPayment();
    }
}
