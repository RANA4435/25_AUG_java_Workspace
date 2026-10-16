package com.scanner3;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter the name");
		
		String name=sc.nextLine();
		System.out.println("enter the price");
		
		int price=sc.nextInt();
		System.out.println("Price="+price);
		System.out.println("Name="+name);
		
		sc.close();
	}

}
