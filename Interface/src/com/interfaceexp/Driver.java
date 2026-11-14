package com.interfaceexp;

interface Payment {
    default void print() {
        System.out.println("Payment default method");
    }
}

interface IPayment {
    void print(); // Abstract method
}

public class Driver implements Payment, IPayment {

    @Override
    public void print() {
        System.out.println("Driver print method");
    }

    public static void main(String[] args) {
        Driver d = new Driver();
        d.print();
    }
}