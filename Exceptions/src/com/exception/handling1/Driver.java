package com.exception.handling1;

public class Driver {

	public static void main(String[] args) {

		Account1 account = new Account1();

		String accNo = null;

		account.doActivate(accNo);
	}
}

class Account1 {

	public void doActivate(String accNo) {

		System.out.println("Starting point of the doActivate");

		doValidate(accNo);

		System.out.println("Ending point of the doActivate");
	}

	private boolean doValidate(String accNo) {

		System.out.println("Starting point of the doValidate");

		boolean isValide = false;

		try {

			String[] address = { "Ranchi" };

			String homeAddress = address[1];
			System.out.println("Home address = " + homeAddress);

			isValide = accNo.startsWith("SBI");

			int amount = 100 / 0;

			int accNoInt = Integer.parseInt(accNo);

			System.out.println("Account number = " + accNoInt);

		} catch (NullPointerException e) {

			System.out.println("Value is null");
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("You are trying to access an invalid array index");
			e.printStackTrace();

		} catch (ArithmeticException e) {

			System.out.println("ArithmeticException: Cannot divide by zero");
			e.printStackTrace();

		} catch (NumberFormatException e) {

			System.out.println("Account number must contain numeric digits");
			e.printStackTrace();

		}
		catch(Exception e) {
			
		}

		System.out.println("Ending point of the validate part");

		return isValide;
	}
}