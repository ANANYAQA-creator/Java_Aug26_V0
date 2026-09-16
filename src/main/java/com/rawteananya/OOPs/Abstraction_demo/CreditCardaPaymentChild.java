package com.rawteananya.OOPs.Abstraction_demo;

public class CreditCardaPaymentChild extends PaymentParent {

    @Override
    //@Override isn't mandatory here,
    // but it's a good practice because it lets the compiler
    // verify that you're actually overriding the parent method.
    public void processPayment(){
        System.out.println("Processing Credit Card payment");
    }

    public static void main (String[] args){

        PaymentParent payment = new CreditCardaPaymentChild();
        //6️⃣ Runtime polymorphism
        // Reference type → PaymentParent
        //Actual object  → CreditCardaPaymentChild
        payment.processPayment(); //calls the child's implementation. That's runtime polymorphism + abstraction together.
        payment.paymentStatus(); //The concrete method inherited from the abstract parent is called successfully.
    }
}
