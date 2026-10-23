package com.polymorphism2;

public class Client {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();


        CreditCard credit = new CreditCard();


        paymentProcessor.processorPayment(credit);
        
        DebitCard debit = new DebitCard();
        paymentProcessor.processorPayment(debit);
    }
}