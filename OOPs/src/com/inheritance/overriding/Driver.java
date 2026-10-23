package com.inheritance.overriding;
class Account {
	int minBalance = 10000;
	public void openAccount(String name,int age) {
		System.out.println("OpenAccount...");
	}
}
class SavingAccount extends Account{
	@Override
	public void openAccount(String name,int age) {
		System.out.println("OpenAccount...");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method name should be as the parents class method
		//type,numbers of args and the other of args 
		//Access modifier should be same public-->public or it should be widen
		// Return name should be except covariant
		Account acc = new Account();
		acc.openAccount("Kamdev", 20);
		
		SavingAccount acc1 = new SavingAccount();
		acc1.openAccount("Satish", 30);
		 System.out.println("The minimum balance is in Account..:"+acc.minBalance);

	}

}
