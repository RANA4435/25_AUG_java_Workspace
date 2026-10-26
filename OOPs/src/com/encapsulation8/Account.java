package com.encapsulation8;

public class Account {
	private int balance;
	private String name;
	private String sender;
	
	//setter method
	public void doCredit(int amount) {
		balance= balance+amount;
	//	System.out.println("The amount to be credited to your Account"+amount);;
	}
	public void doDebit(int amount) {
		balance= balance-amount;
	//	System.out.println("Amount to be Debited from your Acount..."+amount);
	}
	// Getter method
	
	public int balance() {
		return balance;
	}

}
