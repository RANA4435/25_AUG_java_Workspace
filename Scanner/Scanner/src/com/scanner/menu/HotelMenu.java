package com.scanner.menu;

import java.util.Scanner;

public class HotelMenu {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("===== HOTEL MENU =====");
        System.out.println("1. Tea      - ₹20");
        System.out.println("2. Coffee   - ₹30");
        System.out.println("3. Dosa     - ₹60");
        System.out.println("4. Idli     - ₹40");
        System.out.println("5. Biryani  - ₹150");
        
        System.out.println("Please Select the item");
        String name=sc.nextLine();
        
        System.out.println("Please Select the Quantity");
        int number=sc.nextInt();
        int amount=0;
        
        if(name.equals("Tea")) {
        	amount=20*number;
        	
        }else if(name.equals("Coffee")) {
        	amount=30*number;
        }else if(name.equals("Idli")) {
        	amount= 40*number;
        }
        else if(name.equals("Dosa")) {
        	amount=60*number;
        	
        }else if(name.equals("Biryani")) {
        	amount=150*number;
        }
        else {
        	System.out.println("Invalid Enter");
        }
        System.out.println("Item name = " + name);
        System.out.println("Quantity = " + number);
        System.out.println("Total Amount = ₹" + amount);
        sc.close();
	}

}
