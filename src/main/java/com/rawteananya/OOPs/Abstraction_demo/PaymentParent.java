package com.rawteananya.OOPs.Abstraction_demo;

public abstract class PaymentParent {  //You used the abstract keyword properly.

    public abstract void processPayment();
    //It has:
    //abstract keyword ✅
    //No method body ✅
    //Must be implemented by the concrete child ✅

    public void paymentStatus(){ //This proves that an abstract class can contain both abstract and concrete methods.
        //concrete method
        System.out.println("Payment_interface Status Checked");
    }
}
