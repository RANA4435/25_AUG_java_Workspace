package com.clone;

public class Employee implements Cloneable {
	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
