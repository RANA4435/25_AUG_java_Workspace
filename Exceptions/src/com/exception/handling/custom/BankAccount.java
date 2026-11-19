package com.exception.handling.custom;

public class BankAccount {

	int balance;

	public void doWithdraw(String account, double amount) throws InsufficientBalanceException {

		System.out.println("Starting the doWithdraw");

		boolean result = validateBalance(amount);

		if (result) {
			balance = balance - (int) amount;
			System.out.println("Withdrawal successful");
			System.out.println("Remaining balance = " + balance);
		}

		System.out.println("END doWithdraw");
	}

	private boolean validateBalance(double amount) throws InsufficientBalanceException {

		balance = 1000;

		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
		}

		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance! Available balance = " + balance);
		}

		return true;
	}
}