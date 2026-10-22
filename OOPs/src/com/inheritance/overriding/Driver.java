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
		Account acc = new Account();
		acc.openAccount("Kamdev", 20);
		
		SavingAccount acc1 = new SavingAccount();
		acc1.openAccount("Satish", 30);
		 System.out.println("The minimum balance is in Account..:"+acc.minBalance);

	}

}
