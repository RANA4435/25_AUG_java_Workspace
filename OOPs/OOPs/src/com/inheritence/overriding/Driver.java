package com.inheritence.overriding;

class Account {
	int balance;
	public void openAccount(String name,int amount , String add) {
		System.out.println("Account .oprnAccount...."+name);
	}
}
class SavingAccount extends Account {
	@Override
	public void openAccount(String name,int amount , String add) {
		System.out.println("Account .oprnAccount...."+name);
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.openAccount("kamdev", 2000, "Bangalore");

	}

}
