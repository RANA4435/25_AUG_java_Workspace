package com.scanner1;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the first Name ");
		System.out.println("please Enter the age");
		
		String name=sc.nextLine();
		String age=sc.nextLine();
		
		System.out.println("Name:"+name);
		System.out.println("Age="+age);
		
		sc.close();
	}

}
