package com.encapsulation4;

public class Account {
	private String name;
	private String accountNumber;
	private String sender;
	
	private int balance;

	public Account(String name, String accountNumber, String sender, int balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.sender = sender;
		this.balance = balance;
	}
	
	public void doPositive(int amount) {
		if(amount>0) {
			balance = balance+amount;
		}else {
			System.out.println("The number is  negative ");
		}
	}
	public void doNegative(int amount) {
		if(amount<0) {
			balance=balance-amount;
		}else {
			System.out.println("the number is positive");
		}
	}
	public void doInterest(int amount) {
		if(amount>=5000) {
			balance=balance+(balance*8/100);
		}else {
			System.out.println("The balance is less then 5000");
		}
	}
	public void doInterestDeduct(int amount) {
		if(amount<5000) {
			balance=balance-(balance*8/100);
		}else {
			System.out.println("Please maintain the minimum balance to get the interest");
		}
	}
	public int getBalance() {
		return balance;
	}

}
