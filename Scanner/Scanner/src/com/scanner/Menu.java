package com.scanner;

import java.util.Scanner;

public class Menu {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== HOTEL MENU =====");
        System.out.println("1. Tea      - ₹20");
        System.out.println("2. Coffee   - ₹30");
        System.out.println("3. Dosa     - ₹60");
        System.out.println("4. Idli     - ₹40");
        System.out.println("5. Biryani  - ₹150");

        System.out.println("Please select your item");
        String  choice = sc.nextLine();

        System.out.println("Please enter quantity");
        int quantity = sc.nextInt();
       
        System.out.println("Choice = " + choice);
        System.out.println("Quantity = " + quantity);

        sc.close();
    }
}