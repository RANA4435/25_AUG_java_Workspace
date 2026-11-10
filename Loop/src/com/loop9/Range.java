package com.loop9;

import java.util.Scanner;

public class Range {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter the Input");

		boolean num = scan.hasNextInt();
		if (num) {

			int age = scan.nextInt();

			// int age = Integer.parseInt(args[0]);
			if (age > 18 && age < 60) {
				System.out.println("You are eligible to apply the DL");
			} else {
				System.out.println("You are not eligible to apply the DL");
			}

		}
	}

}
