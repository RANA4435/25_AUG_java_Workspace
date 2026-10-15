package com.kodewala.control.flow2;

public class Positivity {

    public static void main(String[] args) {

        Positivity p = new Positivity();

        int number = Integer.parseInt(args[0]);

        p.positivity(number);
    }

    public void positivity(int number) {

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