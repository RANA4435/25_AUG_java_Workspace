package com.exception.handling.custom;

public class UserRegistration {

	public void registerUser(String name, int age) throws InvalidAgeException {

		System.out.println("Starting the register");

		boolean result = validateAge(age);

		if (result) {
			System.out.println("Allowed to register: " + name);
		} else {
			System.out.println("Are not Eligible");
		}

		System.out.println("Ending the register");
	}

	private boolean validateAge(int age) throws InvalidAgeException {

		if (age >= 18 && age <= 60) {

			System.out.println("The person is Eligible = " + age);
			return true;

		} else {

			throw new InvalidAgeException(age + " age must be between 18 to 60");
		}
	}
}