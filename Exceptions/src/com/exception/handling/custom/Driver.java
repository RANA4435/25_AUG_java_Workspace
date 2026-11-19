package com.exception.handling.custom;

public class Driver {

	public static void main(String[] args) throws InvalidAgeException {

		System.out.println("Starting the main()");

		UserRegistration use = new UserRegistration();

		use.registerUser("Kamdev", 20);

		System.out.println("Ending the main()");
	}
}