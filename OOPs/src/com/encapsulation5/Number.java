package com.encapsulation5;

public class Number {
	private int balance;

	public Number(int balance) {
		super();
		this.balance = balance;
	}
	public void doAccept(int number) {
		if(number>0 && number<100) {
			balance=balance+number;
			System.out.println("The Available balance is :");
		}else {
			System.out.println("The input Number is Negative");
		}
	}
	public int getbalance() {
		return balance;
	}

}
