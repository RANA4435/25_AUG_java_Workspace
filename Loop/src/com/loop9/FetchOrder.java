package com.loop9;

public class FetchOrder {

	boolean order;
	int orderId;
	String status;

	public FetchOrder(int orderId, String status, boolean order) {
		this.orderId = orderId;
		this.status = status;
		this.order = order;
	}

	public void stats() {

		if (order) {
			System.out.println("The order is dispatched for delivery");
		} else {
			System.out.println("The order is cancelled");
		}
	}

	public static void main(String[] args) {

		FetchOrder orders = new FetchOrder(1330, "Dispatched for delivery", true);

		orders.stats();
	}
}