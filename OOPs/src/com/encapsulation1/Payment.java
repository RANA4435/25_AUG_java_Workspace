package com.encapsulation1;

public class Payment {
	private int balance;
	private String accountHolder;
	private String accountNumber;
	public Payment(int balance, String accountHolder, String accountNumber) {
		super();
		this.balance = balance;
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	//setter
	public void doPositive(int _amount) {
		if(_amount>0) {
			balance=balance+_amount;
		}else {
			System.out.println("The amount is in negative Number: Transaction cannot be done");
			
		}
	}
	public void doTransfer(int _amount) {
		if(_amount<=balance) {
			balance=balance+_amount;
		}else {
			System.out.println("Amount is not greater or equal to the balance");
		}
	}// Getter 
	public int getBalance() {
		return balance;
	}
	
}
