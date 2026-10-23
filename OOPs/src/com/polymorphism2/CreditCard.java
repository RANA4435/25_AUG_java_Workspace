package com.polymorphism2;

public class CreditCard  extends Payment{
	@Override
	public void doPayment() {
		System.out.println("CreditCard.....CreditCard");
	}

}
