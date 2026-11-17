
package com.exception.handling1;

public class PIN {

	public static void main(String[] args) {

		System.out.println("Started main");

		PIN pin = new PIN();

		pin.verifyPin("12AB"); // NumberFormatException

		pin.verifyPin(null); // NullPointerException

		System.out.println("Ended main");
	}

	public void verifyPin(String pin) {

		System.out.println("The verification started");

		boolean result = validatePin(pin);
		System.out.println("The verification is ended");

	}

	private boolean validatePin(String pin) {

		try {

			// This statement deliberately causes NPE when pin is null
			System.out.println("Finding the length of the pin = " + pin.length());

			if (pin.length() == 4) {

				int number = Integer.parseInt(pin);

				System.out.println("Print the PIN = " + number);

				return true;

			} else {

				System.out.println("It's not a valid PIN");

				return false;
			}

		} catch (NumberFormatException e) {

			System.out.println("PIN should contain only numeric digits");
			e.printStackTrace();

		} catch (NullPointerException e) {

			System.out.println("PIN should not be null");
			e.printStackTrace();
		}

		return false;
	}

}
