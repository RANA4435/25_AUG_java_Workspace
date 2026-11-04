package com.cloning.deepcloning1;

public class Student  implements Cloneable{
	int rollNo;
	String name;
	Address address;
	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Student student = (Student) super.clone();
		student.address=(Address) address.clone();
		return student;
	}

}
