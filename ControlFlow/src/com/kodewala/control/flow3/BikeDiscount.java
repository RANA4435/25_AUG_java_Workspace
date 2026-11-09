package com.kodewala.control.flow3;

public class BikeDiscount {
	int amount;
	
	
	public BikeDiscount(int amount) {
		super();
		this.amount = amount;
	}
	public int discountFinalPrice() {
		int discountRate=15;
		int discountAmount=amount-(amount*discountRate/100);
		int finalPrice=discountAmount;
		
		return finalPrice;
	}


	public static void main(String[] args) {
		BikeDiscount discount =new BikeDiscount(10000);
		int result = discount.discountFinalPrice();
		
		System.out.println("THe amount is before discount is ="+discount.amount);
		
		System.out.println("The amount  after the discount is ="+result);
		
	}

}
