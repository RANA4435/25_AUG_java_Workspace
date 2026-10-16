package com.inheritence.multilevel;

class Account {
	public void openAccount(String name) {
		System.out.println("Account.openAccount");
	}
}

class CurrentAccount extends Account{
	@Override 
	public void openAccount(String name) {
		System.out.println("Account.openAccount");
	}
}

class BusinessAccount extends CurrentAccount{
	@Override
	public void openAccount(String name) {
		System.out.println("Account.openAccount");
	}
}
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		
		
		acc.openAccount("Salman");

	}

}
