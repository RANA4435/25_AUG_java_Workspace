package com.inheritence4;

public class Employee extends Manager{
	boolean isWorking;

	public Employee(String name, String account, int balance, String empId, boolean isWorking) {
		super(name, account, balance, empId);
		this.isWorking = isWorking;
	}
	
public void viewEmployeeDetails() {
	System.out.println(name);
	System.out.println(account);
	System.out.println(balance);
	System.out.println(empId);
	
	System.out.println(isWorking);
}
}
