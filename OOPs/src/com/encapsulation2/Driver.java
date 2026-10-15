package com.encapsulation2;

public class Driver {

	public static void main(String[] args) {
		Payment payment = new Payment(1000, "Kamdev Rana", "98765467890");
		//payment.showBalance();
		
		payment.withdraw(200);
	}

}
