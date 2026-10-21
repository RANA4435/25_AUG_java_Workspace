package com.abstraction1;

public class User {
	public static void main(String[] args) {
		PlaceOrder order = new PlaceOrder();
		
		  boolean result=order.placeOrder("Ka", "Bangalore", 42, 2000);
		System.out.println("Order:"+result);
	}
	

}
