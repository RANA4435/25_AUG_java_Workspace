package com.kodewala.control.flow2;

public class EvenOdd {

    public static void main(String[] args) {

        EvenOdd ev = new EvenOdd();

        int number = Integer.parseInt(args[0]);

        ev.evenOdd(number);
    }

    public void evenOdd(int number) {

        int remainder = number % 2;

        switch (remainder) {

        case 0:
            System.out.println("The Number is divisible by 2="+number);
            break;

        case 1:
            System.out.println("The Number is not divisible by 2, so it is an odd number="+number);
            break;
        }
    }
}