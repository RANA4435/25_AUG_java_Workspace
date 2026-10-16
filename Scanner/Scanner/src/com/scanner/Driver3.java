package com.scanner;

import java.util.Scanner;

public class Driver3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("======= MENU======");
		System.out.println("1.Tea $ Snacks  *50");
		System.out.println("1.Coffee        *80");
		System.out.println("1.Idli          *90");
		System.out.println("1.Dosa          *120");
		System.out.println("1.Biryani       *220");
		
		
		System.out.println("Please Select the item that you want to have  ");
		
		int amount=0;
		String name=sc.nextLine();
		
		System.out.println("Please Enter the Number of items you want");
		int number=sc.nextInt();
		if(name.equals("Tea & Snacks")) {
			amount=50*number;
		}else if(name.equals("Coffee")) {
			amount=80*number;
		}else if(name.equals("Idli")) {
			amount=90*number;
		}else if(name.equals("Dosa")) {
			amount=120*number;
		}else if(name.equals("Biryani")) {
			amount=220*number;
		}
		
		System.out.println("Name="+name);
		System.out.println("Quantity="+number);
		System.out.println("Price="+amount);
		sc.close();
	}

}
