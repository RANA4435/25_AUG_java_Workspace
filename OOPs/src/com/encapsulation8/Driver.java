package com.encapsulation8;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.doCredit(1000);
		acc.doDebit(900);
		
		System.out.println("By getter method we see the Available balance ... "+acc.balance());

	}

}
