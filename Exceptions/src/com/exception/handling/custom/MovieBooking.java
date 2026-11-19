package com.exception.handling.custom;

public class MovieBooking {

	int availableTickets;
	String movieName;

	public MovieBooking(String movieName, int availableTickets) {
		this.movieName = movieName;
		this.availableTickets = availableTickets;
	}

	public void doBooking(int tickets) throws InvalidTicketException {

		System.out.println("Started the booking");

		validated(tickets);

		availableTickets = availableTickets - tickets;

		System.out.println("Booking successful!");
		System.out.println("Movie Name: " + movieName);
		System.out.println("Remaining tickets: " + availableTickets);

		System.out.println("End the booking");
	}

	private void validated(int tickets) throws InvalidTicketException {

		if (tickets <= 0) {
			throw new IllegalArgumentException("Ticket count must be greater than zero");
		}

		if (tickets > availableTickets) {
			throw new InvalidTicketException("Not enough tickets available");
		}
	}
}