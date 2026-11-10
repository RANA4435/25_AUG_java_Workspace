package com.scanner4;

import java.util.Scanner;

public class IsValidate {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        System.out.println("Please Enter a valid Number");

        boolean num = scann.hasNextInt();

        if (num) {

            int number = scann.nextInt();

            System.out.println("The Number is valid: " + number);

        } else {

            System.out.println("The Entered number is not valid");

        }

        scann.close();
    }
}