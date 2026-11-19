package com.exception.handling.custom;

public class Driver1 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            account.doWithdraw("SBI123", 1500);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed!");
            System.out.println(e.getMessage());
        }

    }
}