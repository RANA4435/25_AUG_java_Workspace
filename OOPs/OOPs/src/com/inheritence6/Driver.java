package com.inheritence6;

// This Inheritance class has two Disadvantage 
// Tight couple
//heavy loading in the parents class

class Account{
	public void openAccount(String userId,String name) {
		System.out.println("Account.opneAccount");
	}
		// TODO Auto-generated method stub

	}
class  SavingAccount extends Account{
	@Override // changing the super class Functionalities
	public void openAccount(String userId,String name) {
		System.out.println("SavingAccount.opneAccount");
	}
}
class SrcCitAccount extends SavingAccount{
	@Override
	public void openAccount(String userId,String name) {
		System.out.println("SrcCitAccount.opneAccount");
	}
}
class PensionAccount extends SrcCitAccount {
	@Override
	public void openAccount(String userId,String name) {
		System.out.println("Pension.opneAccount");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account =new Account();
		account.openAccount("KK4435","Rana");

	}

}
