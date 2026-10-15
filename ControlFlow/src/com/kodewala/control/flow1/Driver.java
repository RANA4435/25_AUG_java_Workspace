package com.kodewala.control.flow1;

public class Driver {

    public static void main(String args[]) {

        TripPlanner trip = new TripPlanner();

        String result = trip.discountApply(7000);

        System.out.println(result);
    }
}