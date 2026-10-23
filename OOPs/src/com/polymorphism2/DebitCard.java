package com.polymorphism2;

public class DebitCard  extends Payment{
	@Override
	public void doPayment() {
		System.out.println("DebitCard.....DebitCard");
	}
}
