package com.loop9;

import java.util.Scanner;

public class LuckyNumber {

	static final int luckyNumber = 35;
	static Scanner scan = new Scanner(System.in);

	public static boolean checkLuckyNumber(int num) {
		boolean status = true;
		while (status) {

			if (luckyNumber == num) {
				return true;
			} else {

				System.out.println("Sorry Try again!!");

				System.out.println("Please Provide number");
				num = scan.nextInt();
			}

		}
		return false;

	}

	public void validation(int number) {

		if (checkLuckyNumber(number)) {
			System.out.println("Won!!!");
		}

	}

	public static void main(String[] args) {

		System.out.println("Please Enter the  valid Number");
		int number = scan.nextInt();

		LuckyNumber luck = new LuckyNumber();

		luck.validation(number);

	}

}
