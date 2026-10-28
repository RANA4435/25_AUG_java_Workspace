package com.interface1;

public class FlightBooking  implements IDiscount{
	@Override
	public  int doIDiscount(int amount, int rate) {
		int finalfare= amount-(amount*rate/100);
		return finalfare;
	}
	@Override
	public  void iDiscountTax(int tax) {
		System.out.println("Tax....");
	}

}
