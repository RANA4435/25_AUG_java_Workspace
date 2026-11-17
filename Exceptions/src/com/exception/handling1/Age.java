
package com.exception.handling1;

public class Age {

	public static void main(String[] args) {

		System.out.println("Main started");

		Age age = new Age();

		age.checkEligiblity(0);

		System.out.println("The main End");
	}

	public void checkEligiblity(int age) {

		System.out.println("The Eligibility method is started");

		boolean result = validateAge(age);

		if (result) {
			System.out.println("Person is eligible");
		} else {
			System.out.println("Person is not eligible");
		}

		System.out.println("The Eligibility method is ended");
	}

	private boolean validateAge(int age) {

		try {

			if (age < 18 || age > 60) {

				throw new IllegalArgumentException("Age must be between 18 and 60");
			}

			System.out.println("Allowed to print the age of the person = " + age);

			return true;

		} catch (IllegalArgumentException e) {

			System.out.println("Invalid age: " + e.getMessage());

			e.printStackTrace();

			return false;
		}
	}
}
