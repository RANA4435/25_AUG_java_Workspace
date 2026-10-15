package com.scanner3;

import java.util.Scanner;

public class Driver2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int price=0;
		
		System.out.println("please enter the Price");
		
		if(sc.hasNextInt()) {
			price=sc.nextInt();		
			}else {
				System.out.println("Enter the value in the right Format");
			}
		System.out.println("price="+price);
		sc.close();
	}

}
