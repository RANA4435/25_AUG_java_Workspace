package com.abstraction2;
class BankAccount{
	public boolean openAccount(String name,int age, int amount,int balnce) {
		doWithdraw(amount);
		doCredit(amount);
		System.out.println("OPening Account....");
		return true;
	}
	private void doWithdraw(int amount) {
		System.out.println("Withdrwa the amount...."+amount);
	}
	private void doCredit(int balance) {
		System.out.println("Available Balance is ...."+balance);
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount();
		acc.openAccount("Kamdev", 20, 10000, 20000000);

	}

}
