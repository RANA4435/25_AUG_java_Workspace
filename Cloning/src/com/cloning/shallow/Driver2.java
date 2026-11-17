package com.cloning.shallow;

public class Driver2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Marks mark = new Marks(10,20,30);
		
		Student std = new Student("kamdev", 24, 1, mark);
		
		Student cloneObj = (Student) std.clone();
		
		std.marks.marks=30;
		
		System.out.println("The original object of the student table is ="+std.marks.marks);
		System.out.println("The cloned object of the ="+cloneObj.marks.marks);
	}

}
