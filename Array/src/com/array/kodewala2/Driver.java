package com.array.kodewala2;

public class Driver {

    public static void main(String[] args) {

        Account[] accounts = new Account[3];

        accounts[0] = new Account("Rahul", 1000, "18764894");
        accounts[1] = new Account("Amit", 10000, "48767849874");
        accounts[2] = new Account("Rana", 15000, "8974948749");

        for (int i = 0; i < accounts.length; i++) {

            if (accounts[i].balance < 2000) {
                System.out.println("Print the Name = " + accounts[i].balance+" "+accounts[i].name);
            }
        }
    }
}