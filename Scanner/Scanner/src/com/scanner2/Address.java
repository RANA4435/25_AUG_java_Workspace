package com.scanner2;

import java.util.Scanner;

public class Address {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the name:");
		System.out.println("Please enter the Address:");
		System.out.println("Please enter the Town:");
		System.out.println("Please enter the District:");
		System.out.println("Please enter the Father's Name:");
		System.out.println("Please enter the Mother's Name:");
		System.out.println("Please enter the School Name:");
		
		String name=sc.nextLine();
		String address=sc.nextLine();
		String town=sc.nextLine();
		String district=sc.nextLine();
		String fatherName=sc.nextLine();
		String motherName=sc.nextLine();
		String school=sc.nextLine();
		
		System.out.println("Student Name="+name);
		System.out.println("Student addres="+address);
		System.out.println("Student  town="+town);
		System.out.println("Student District="+district);
		System.out.println("Student Father Name="+fatherName);
		System.out.println("Student Mother Name="+motherName);
		System.out.println("Student School Name="+school);
		
		
		sc.close();
	}

}
