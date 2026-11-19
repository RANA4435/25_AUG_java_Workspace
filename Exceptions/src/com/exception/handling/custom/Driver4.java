package com.exception.handling.custom;

public class Driver4 {

    public static void main(String[] args) {

        MovieBooking movie = new MovieBooking("Avengers", 10);

        BookingService service = new BookingService();

        try {
            service.confirmBooking(movie, 4);
        }
        catch (InvalidTicketException e) {
            System.out.println("InvalidTicketException: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        System.out.println("End of program");
    }
}