
package com.exception.handling1;

public class Accounts {

	public static void main(String[] args) {

		System.out.println("Main ");

		Accounts acc = new Accounts();

		acc.activeAccount(null);

		System.out.println("Main End");
	}

	public void activeAccount(String accNo) {

		System.out.println("The Active method started");

		boolean validateAccount = validateAccount(accNo);

		System.out.println("The Active method Ended");
	}

	private boolean validateAccount(String accNo) {

		try {

			System.out.println("Finding the length of the Account No = " + accNo.length());

			System.out.println("Check whether the Account Number is starting with SBI = " + accNo);

		} catch (NullPointerException e) {

			System.out.println("Account number should not be null");

			e.printStackTrace();

			return false;
		}

		return true;
	}
}
