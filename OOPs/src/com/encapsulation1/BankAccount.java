
package com.encapsulation1;

public class BankAccount {

    // Private data members
    private String name = "kamdev";
    private String accNo = "5354635356";
    private int balance = 10000;

    // Method to withdraw money
    public void doTransaction(int amount) {

        if (amount > 0 && amount <= balance) {

            balance = balance - amount;

            System.out.println("Transaction successful!");
            System.out.println("Withdrawn amount = " + amount);

        } else {

            System.out.println("Transaction is not allowed.");
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check current balance
    public int doBalance() {
        return balance;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for account number
    public String getAccNo() {
        return accNo;
    }
}

