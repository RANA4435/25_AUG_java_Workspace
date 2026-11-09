package com.kodewala.control.flow3;

public class MembersDetails {

	// Instance variables
	String name;
	int salary;
	int id;

	// Constructor
	public MembersDetails(String name, int salary, int id) {

		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	// Method to update employee details
	public void updateDetails(String name, int salary, int id) {

		this.name = name;
		this.salary = salary;
		this.id = id;

	}

	// Method to display employee details
	public void displayDetails() {

		System.out.println("Employee Name = " + name);
		System.out.println("Employee Salary = " + salary);
		System.out.println("Employee ID = " + id);

		System.out.println("----------------------");
	}

	public static void main(String[] args) {

		MembersDetails details = new MembersDetails("Kamdev", 10000, 56465674);

		MembersDetails details1 = new MembersDetails("AA", 1000000, 101);

		System.out.println("Before Updating:");

		details.displayDetails();

		// Updating employee details
		details.updateDetails("Rahul", 25000, 102);

		System.out.println("After Updating:");

		details.displayDetails();

		System.out.println("Second Employee:");

		details1.displayDetails();
	}
}