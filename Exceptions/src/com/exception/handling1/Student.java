package com.exception.handling1;

public class Student {
	public static void main(String[] args) {
		System.out.println("main started");
		Student std = new Student();
		std.validateStudent(null);
		System.out.println("Main ended");
		
	}
	public void validateStudent(String name) {
		
		System.out.println("the starting point of the validate");
		
		
		
		try {
		System.out.println("The length of the name is ="+name.length());
		}catch(NullPointerException e) {
	      System.out.println("You finding the length of the null String");
	      e.printStackTrace();
		}
		try {
		System.out.println("The first caharcter at the place of the 0th index is ="+name.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("Performing an operation on the null String");
			e.printStackTrace();
		}
		try {
		System.out.println("Converting the name into uppercase="+name.toUpperCase());
		}
		catch(NullPointerException e) {
			System.out.println("There is value to convert it into the  upperCase");
			e.printStackTrace();
		}
		catch(Exception e) {
			
		}
		
		System.out.println("Ending point of the validate");
	}

}
