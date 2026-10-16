package com.encapsulation;
//this class is not well encapsulated

public class Payment {
	private int balance;//we are providing the data in the private because no one should able to modify my data
	
	// constructing the constructor
	public Payment(int balance) {
		super();
		this.balance = balance;
	}
	//setter
	// modifying the data using the balance
	public void doDebit(int _amount) {
	       balance=balance-_amount;
	}
	// modifying the data using the balance

	public void doCredit(int _amount) {
		if(_amount>0) {
			balance=balance+_amount;

		}
	}
	// this will work to get the balance getter
	public int  getBalance() {
		return balance;
	}

}
