package com.scanner;

import java.util.Scanner;

public class Driver1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Price");
		int price=sc.nextInt();
		System.out.println("Price="+price);
		
		sc.close();
	}

}
