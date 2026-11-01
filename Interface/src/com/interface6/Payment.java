
package com.interface6;

public class Payment {

	public void processPayment(IPayment payment, double amount) {

		if (payment == null) {
			System.out.println("Invalid Payment Method!");
			return;
		}

		if (amount <= 0) {
			System.out.println("Invalid Payment Amount!");
			return;
		}

		boolean status = payment.pay(amount);

		if (status) {

			PaymentSuccess success = new PaymentSuccess();

			success.showSuccess(amount);

		} else {

			System.out.println("Payment Failed!");

		}
	}
}
