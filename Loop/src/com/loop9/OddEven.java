package com.loop9;

public class OddEven {

	public static void main(String[] args) {

		for (int i = 0; i <= 1000; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				System.out.println(i + " is divisible by both 3 and 5");

			} else {

				System.out.println(i + " is not divisible by both 3 and 5");

			}
		}
	}
}