package com.interface3;

public class UPIPayments implements Payments {
	@Override
	public void doPayments(int amount) {
		System.out.println("The amount is paid by the UPIPayments ="+amount);
	}

}
