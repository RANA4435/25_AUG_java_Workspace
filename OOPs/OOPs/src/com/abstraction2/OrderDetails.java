
package com.abstraction2;

class Order {

	public boolean placeOrder(String name, String address, int pin, int price, int size) {

		validateName(name);
		validateAddress(address);
		validatePin(pin);
		validatePrice(price);
		validateSize(size);

		System.out.println("Order placed successfully!");

		return true;
	}

	public void validatePrice(int price) {
		System.out.println("Price: " + price);
	}

	public void validateName(String name) {
		System.out.println("Name: " + name);
	}

	public void validateAddress(String address) {
		System.out.println("Address of the delivery: " + address);
	}

	public void validatePin(int pin) {
		System.out.println("Pin-Code: " + pin);
	}

	public void validateSize(int size) {
		System.out.println("Size: " + size);
	}
}

public class OrderDetails {

	public static void main(String[] args) {

		Order order = new Order();

		order.placeOrder("Kamdev", "Bangalore", 6545543, 2000, 42);
	}
}
