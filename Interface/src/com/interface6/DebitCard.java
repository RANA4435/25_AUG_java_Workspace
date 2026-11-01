
package com.interface6;

public class DebitCard implements IPayment {

    @Override
    public boolean pay(double amount) {

        System.out.println("Processing Debit Card Payment...");

        System.out.println("Amount Paid: " + amount);

        return true;
    }
}
