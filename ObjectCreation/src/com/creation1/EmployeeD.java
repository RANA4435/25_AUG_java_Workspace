package com.creation1;

public class EmployeeD {
	String name;
	String id;
	int salary;
	public EmployeeD(String name, String id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("The name of the employee is ="+name);
		System.out.println("The Id of the employee is ="+id);
		System.out.println("The Salary of the employee is ="+salary);
		
		
	}
	public static void main(String[] args) {
		EmployeeD emp = new EmployeeD("kamdev", "KD1234", 1000000);
		emp.display();
		
				
	}

}
