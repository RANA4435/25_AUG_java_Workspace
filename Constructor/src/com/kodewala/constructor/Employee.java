package com.kodewala.constructor;

public class Employee {
	String name;
	int age;
	String accNo;
	public Employee(String name, int age, String accNo) {
		super();
		this.name = name;
		this.age = age;
		this.accNo = accNo;
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee("kamdev",24,"36129887217");
		System.out.println("The name of the Employee is ="+emp.name);
		System.out.println("The age of the employee is ="+emp.age);
		System.out.println("The Account number of the employee is ="+emp.accNo);
	}

}
