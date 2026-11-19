package com.exception.handling.custom;

public class BookingService {

	public void confirmBooking(MovieBooking booking, int tickets) throws InvalidTicketException {

		System.out.println("Booking started");

		booking.doBooking(tickets);

		System.out.println("Booking completed");
	}
}