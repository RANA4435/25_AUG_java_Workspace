package com.kodewala.control.flow2;

public class Driver3 {
	public static void main(String[] args) {
		Driver3 dd = new Driver3();
		String customer = args[1];
		int amount = Integer.parseInt(args[0]);
		
		dd.discount(amount, customer);
	}

	// create method
	public void discount(int amount, String customer) {
		double dis = 0;
		double finalPrice = amount;
		
		switch(customer) {
		
		case "gold":
			if(amount>1000) {
				dis = amount*20/100;
				finalPrice = amount-dis;
			}
			System.out.println("Final Price : "+finalPrice);
			break;
		}

	}
}
