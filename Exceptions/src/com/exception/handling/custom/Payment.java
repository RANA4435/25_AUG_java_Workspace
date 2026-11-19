package com.exception.handling.custom;

public class Payment {

	public void makePayment(double amount) throws InvalidPaymentException {

		System.out.println("Starting payment");

		validatePayment(amount);

		System.out.println("Payment successful");
		System.out.println("Print the amount = " + amount);

		System.out.println("Ending payment");
	}

	private void validatePayment(double amount) throws InvalidPaymentException {

		if (amount > 0) {
			System.out.println("Payment amount is valid");
		} else {
			throw new InvalidPaymentException("Payment amount must be greater than zero");
		}
	}

	public void processOrder(double amount) throws InvalidPaymentException {

		System.out.println("Processing order");

		makePayment(amount);

		System.out.println("Order processing completed");
	}
}