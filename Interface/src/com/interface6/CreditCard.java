package com.interface6;

public class CreditCard implements IPayment {

    @Override
    public boolean pay(double amount) {

        System.out.println("Processing Credit Card Payment...");

        System.out.println("Amount Paid: " + amount);

        return true;
    }
}
