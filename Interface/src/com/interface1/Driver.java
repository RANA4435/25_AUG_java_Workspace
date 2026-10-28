package com.interface1;

public interface Driver {
	public static void main(String[] args) {
		IDiscount discount = new FlightBooking();
		int result = discount.doIDiscount(1000, 10);
		
		System.out.println("final ="+result);
		FlightBooking book = new FlightBooking();
		 int s=book.doIDiscount(1000, 60);
		 System.out.println("The result will  be .."+s);
	}

}
