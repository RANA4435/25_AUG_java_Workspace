package com.kodewala.control.flow3;

public class CarDiscount {

	// Instance variable
	int amount;

	// Constructor
	public CarDiscount(int amount) {
		this.amount = amount;
	}

	// Method to calculate discount
	public int calculateFinalPrice() {

		// Local variables
		int discountRate = 15;

		int discountAmount = amount * discountRate / 100;

		int finalPrice = amount - discountAmount;

		return finalPrice;
	}

	public static void main(String[] args) {

		CarDiscount car = new CarDiscount(100000);

		int result = car.calculateFinalPrice();

		System.out.println("Original Car Price = " + car.amount);

		System.out.println("Final Price After Discount = " + result);
	}
}