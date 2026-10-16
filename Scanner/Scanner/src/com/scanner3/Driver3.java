package com.scanner3;

import java.util.Scanner;

public class Driver3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int price  =0;
		
		System.out.println("Please Enter the amount");
		
		if(sc.hasNextInt()) {
			price=sc.nextInt();
		}else {
			System.out.println("Please Enter the value in the right format");
		}
		System.out.println("price="+price);
		sc.close();
		
	}
	

}
