package com.interface6;

public class Driver {

	public static void main(String[] args) {

		Payment payment = new Payment();

		IPayment credit = new CreditCard();

		IPayment debit = new DebitCard();

		IPayment wallet = new WalletPay();

		System.out.println("===== CREDIT CARD =====");

		payment.processPayment(credit, 5000);

		System.out.println("===== DEBIT CARD =====");

		payment.processPayment(debit, 3000);

		System.out.println("===== WALLET PAYMENT =====");

		payment.processPayment(wallet, 1500);

	}
}
