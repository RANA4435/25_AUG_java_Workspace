package com.polymorphism7;
// compile time polymorphism
class Account {
	public void openAccount(String name, String address, String pan, int age) {
		System.out.println("Opening the account required few things...");
	}
	public void openAccount(String name) {
		System.out.println("Name of the applicant"+name);
	}
	public void openAccount(int age) {
		System.out.println("Age of the Applicant....");
	}
	
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		acc.openAccount("Kamdev", "Bangalore", "GZIPR2667M", 25);
		acc.openAccount("Kamdev");

	}

}
