package com.loop9;

public class Range {
	public static void main(String[] args) {
		
		
		int age = Integer.parseInt(args[0]);
		if(age>18 && age<60) {
			System.out.println("You are eligible to apply the DL");
		}else {
			System.out.println("You are not eligible to apply the DL");
		}

	}

}
