package com.polymorphism10;

public class OrderCaller {
	public void doOrder(Order order) {
		System.out.println("Order caller...");
		order.doOrder("Kamdev", 1000, 6);
	}

}
