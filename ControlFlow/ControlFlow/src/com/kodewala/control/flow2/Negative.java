package com.kodewala.control.flow2;

public class Negative {

    public static void main(String args[]) {

        Negative neg = new Negative();

        int number = -10;

        neg.negativity(number);
    }

    public void negativity(int number) {

        int result = 0;

        if (number > 0) {
            result = 1;

        } else if (number < 0) {
            result = -1;

        } else {
            result = 0;
        }

        switch (result) {

        case 1:
            System.out.println("The number is positive");
            break;

        case -1:
            System.out.println("The number is negative");
            break;

        case 0:
            System.out.println("The number is zero");
            break;
        }
    }
}