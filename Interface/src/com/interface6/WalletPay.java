
package com.interface6;

public class WalletPay implements IPayment {

    @Override
    public boolean pay(double amount) {

        System.out.println("Processing Wallet Payment...");

        System.out.println("Amount Paid: " + amount);

        return true;
    }
}
