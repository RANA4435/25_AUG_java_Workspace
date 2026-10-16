package com.StudentDetails;

public class Employee {
	String name;
	int age;
	int salary;
	
	Employee(String _name, int _age, int _salary){
		this.name=_name;
		this.age=_age;
		this.salary=_salary;
	}
	Employee(){
		System.out.println("Hello");
	}

}
