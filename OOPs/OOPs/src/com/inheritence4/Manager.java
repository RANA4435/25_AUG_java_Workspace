package com.inheritence4;

public class Manager {
	String name;
	String account;
	int balance;
	String empId;
	public Manager(String name, String account, int balance, String empId) {
		super();
		this.name = name;
		account = account;
		this.balance = balance;
		this.empId = empId;
	}
	
	public void viewManagerDetails() {
		System.out.println(name);
		System.out.println(account);
		System.out.println(balance);
		System.out.println(empId);
	}

}
