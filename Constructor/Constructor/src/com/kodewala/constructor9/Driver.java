package com.kodewala.constructor9;

public class Driver {
	public static void main(String args[]) {
		Exam pp=new Exam("KKR",22,567,8,"java",12,1400);
		System.out.println(pp.name);
		System.out.println(pp.age);
		System.out.println(pp.marks);
		System.out.println(pp.section);
		System.out.println(pp.course);
		System.out.println(pp.rollNo);
		System.out.println(pp.fees);
		System.out.println("hello this is the complete constuctor");
		
	}

}
