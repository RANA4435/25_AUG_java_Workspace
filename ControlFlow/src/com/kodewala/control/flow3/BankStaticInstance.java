package com.kodewala.control.flow3;

public class BankStaticInstance {

    // Instance variables: separate for each bank account
    long accNo;
    int loan;
    String name;

    // Static variable: shared by all bank accounts
    static int interestRate = 15;

    public void doHDFC(int loan) {

        this.loan = loan;

        accNo = 36129887217L;
        name = "Kamdev";

        if (loan < 5000) {

            int interest = loan * interestRate / 100;
            int totalAmount = loan + interest;

            System.out.println("Account Number = " + accNo);
            System.out.println("Account Holder = " + name);
            System.out.println("Loan Amount = " + loan);
            System.out.println("Interest Rate = " + interestRate + "%");
            System.out.println("Total Amount After Interest = " + totalAmount);

        } else {

            System.out.println("There is no charge for the amount greater than 5000");

        }
    }

    public static void main(String[] args) {

        BankStaticInstance bank = new BankStaticInstance();

        bank.doHDFC(4000);

    }
}