package com.clone2;

public class Manager implements Cloneable {
	String name;
	String id;
	int salary;
	public Manager(String name, String id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
