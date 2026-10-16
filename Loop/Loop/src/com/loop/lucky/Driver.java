package com.loop.lucky;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int luckyNumber=13;
		int userEntered=0;
		
		while(luckyNumber !=userEntered) {
			System.out.println("Please enter the Number");
			userEntered=sc.nextInt();
			if(userEntered ==luckyNumber) {
				System.out.println("you won !!");
			}else {
				System.out.println("please try again");
			}
		}
	}
	
 
}
