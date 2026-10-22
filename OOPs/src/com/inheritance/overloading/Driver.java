package com.inheritance.overloading;
class Account{
	int minBalance;
	public void openaccount(String name,int amount) {//v1
		System.out.println("openaccount...");
	}
	public  void openaccount(String name, int amount,int salary) {//v2
		System.out.println("openaccount...");
	}
	public  void openaccount(int amount) {//v3
		System.out.println("openaccount...");
	}
	
	
	
}


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.openaccount("kamdev", 10000);

	}

}
