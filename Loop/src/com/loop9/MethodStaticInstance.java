package com.loop9;

public class MethodStaticInstance {

	static int age = 25; // Static variable

	int salary; // Instance variable

	public MethodStaticInstance(int salary) {
		this.salary = salary;
	}

	// Static method
	public static void displayAge() {
		System.out.println("Age = " + age);
	}

	// Instance method
	public void displaySalary() {
		System.out.println("Salary = " + salary);
	}

	public static void main(String[] args) {

		MethodStaticInstance stats = new MethodStaticInstance(30000);

		// Calling static method
		MethodStaticInstance.displayAge();

		// Calling instance method
		stats.displaySalary();
	}
}