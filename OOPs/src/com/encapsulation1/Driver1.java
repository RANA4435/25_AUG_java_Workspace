package com.encapsulation1;

public class Driver1 {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		
		bank.doTransaction(10000);
		bank.doBalance();
	}

}
