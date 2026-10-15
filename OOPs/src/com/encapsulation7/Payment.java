package com.encapsulation7;

public class Payment {
	private int balance;
	private String account;
	private String name;
	public Payment(int balance, String account, String name) {
		super();
		this.balance = balance;
		this.account = account;
		this.name = name;
	}
	
	private void doDebit(int amount) {
		if(amount>0) {
			balance=balance-amount;
		}else {
			System.out.println("The amount is less then 0");
		}
	}
	public void doCredit(int amount) {
		if(amount>0) {
		balance=balance+amount;
		}else {
			System.out.println("The input amount is not valide");
		}
	}
	
	public int getBalance() {
		return balance;
	}

}
