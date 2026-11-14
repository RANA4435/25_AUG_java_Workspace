package com.creation1;

public class Student {
	String name;
	int age;
	int rollNo;
	public Student(String name, int age, int rollNo) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}
	
	public static void main(String[] args) {
		Student st = new Student("Kamdev", 20, 10);
		
		System.out.println("The name of the Student is ="+st.name);
		System.out.println("THe age of the Student si ="+st.age);
		System.out.println("The rool no of the student is ="+st.rollNo);
	}
}
