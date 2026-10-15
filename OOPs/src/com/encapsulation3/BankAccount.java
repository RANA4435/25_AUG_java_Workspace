package com.encapsulation3;

public class BankAccount {
	private int balance;
	private String acc;
	private String name;
	private String bankName;
	
	
	
	
	public BankAccount(int balance, String acc, String name, String bankName) {
		super();
		this.balance = balance;
		this.acc = acc;
		this.name = name;
		this.bankName = bankName;
	}
	public void doWithdraw(int amount) {
		if(amount>0) {
			balance=balance-amount;
		}else {
			System.out.println("Balance is sufficient to withdraw");
		}
	}
	public void doCredit(int amount) {
		if(amount>10) {
			balance=balance+amount;
		}else {
			System.out.println("the bvalnce is not greater then 10");
		}
	}
	public int getBalnce() {
		return balance;
	}

}
