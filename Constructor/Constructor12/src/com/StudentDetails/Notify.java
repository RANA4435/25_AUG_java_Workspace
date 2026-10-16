package com.StudentDetails;

public class Notify {

    public void sendNotify(String _type) {

        System.out.println("Notify.sendNotify");

        if (_type.equalsIgnoreCase("age")) {

            sendAge();

        } else if (_type.equalsIgnoreCase("marks")) {

            sendMarks();

        } else {

            sendRoll();
        }
    }

    private void sendAge() {

        System.out.println("Notify.sendAge() START");

        // Business Logic

        System.err.println("Notify.sendAge() END");
    }

    private void sendMarks() {

        System.out.println("Notify.sendMarks() START");

        // Business Logic

        System.out.println("Notify.sendMarks() END");
    }

    private void sendRoll() {

        System.out.println("Notify.sendRoll() START");

        // Business Logic

        System.out.println("Notify.sendRoll() END");
    }
}