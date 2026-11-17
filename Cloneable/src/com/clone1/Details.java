package com.clone1;

public class Details implements Cloneable {
	String name;
	int age;
	int section;
	public Details(String name, int age, int section) {
		super();
		this.name = name;
		this.age = age;
		this.section = section;
	}
	
	@Override
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
