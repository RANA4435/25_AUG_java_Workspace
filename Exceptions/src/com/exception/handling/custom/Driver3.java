package com.exception.handling.custom;

public class Driver3 {
	public static void main(String[] args) {
		System.out.println("Starting the main");
		Payment pay = new Payment();
		try {
			pay.makePayment(12000);
		} catch (InvalidPaymentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ending the main");
		
	}

}
