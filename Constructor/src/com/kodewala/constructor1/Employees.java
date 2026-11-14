package com.kodewala.constructor1;

public class Employees {
	String name;
	String empId;
	String accNo;
	int age;
	public Employees(String name, String empId, String accNo, int age) {
		super();
		this.name = name;
		this.empId = empId;
		this.accNo = accNo;
		this.age = age;
	}
	
	

}
class Employee extends Employees{
	int account;

	public Employee(String name, String empId, String accNo, int age, int account) {
		super(name, empId, accNo, age);
		this.account = account;
	}
	
	public static void main(String[] args) {
		Employees emp = new Employee("Kamdev","KR6736","36129887217",24,3266555);
		Employee emp1 = new Employee("Kamdev","KR6736","36129887217",24,3266555);

		System.out.println("The Account number of the Employee table is ="+emp.accNo);
		System.out.println("The Account is ="+emp1.account);
	}
	
}

