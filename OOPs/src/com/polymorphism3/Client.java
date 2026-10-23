package com.polymorphism3;

public class Client {

    public static void main(String[] args) {

        TravelProcessor travel = new TravelProcessor();

        Train train = new Train();

        travel.travelProcessor(train);
    }
}