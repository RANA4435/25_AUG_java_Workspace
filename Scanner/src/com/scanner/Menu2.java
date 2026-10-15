package com.scanner;

import java.util.Scanner;

public class Menu2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== HOTEL MENU =====");
        System.out.println("1. Tea      - ₹20");
        System.out.println("2. Coffee   - ₹30");
        System.out.println("3. Dosa     - ₹60");
        System.out.println("4. Idli     - ₹40");
        System.out.println("5. Biryani  - ₹150");

        System.out.println("Please select your item");
        String choice = sc.nextLine();

        System.out.println("Please enter quantity");
        int quantity = sc.nextInt();

        int amount = 0;

        if (choice.equals("Tea")) {
            amount = 20 * quantity;

        } else if (choice.equals("Coffee")) {
            amount = 30 * quantity;

        } else if (choice.equals("Dosa")) {
            amount = 60 * quantity;

        } else if (choice.equals("Idli")) {
            amount = 40 * quantity;

        } else if (choice.equals("Biryani")) {
            amount = 150 * quantity;

        } else {
            System.out.println("Invalid choice");
        }

        System.out.println("Choice = " + choice);
        System.out.println("Quantity = " + quantity);
        System.out.println("Total Amount = ₹" + amount);

        sc.close();
    }
}