package com.kodewala.constructor12;

public class Details extends Bank {
	int balance;
	public Details(int _amount,String _name,String _accNo,int _balance) {
		super(_amount,_name,_accNo);
		this.balance=_balance;
	}

}
