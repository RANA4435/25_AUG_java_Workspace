package com.cloning.shallow;

public class Student implements Cloneable{
	String name;
	int age ;
	int section;
	
	Marks marks;

	public Student(String name, int age, int section, Marks marks) {
		super();
		this.name = name;
		this.age = age;
		this.section = section;
		this.marks = marks;
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}

}
