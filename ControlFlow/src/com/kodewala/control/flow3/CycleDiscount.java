package com.kodewala.control.flow3;

public class CycleDiscount {
	int amount;
	
	
	public CycleDiscount(int amount) {
		super();
		this.amount = amount;
	}
	public int cycleDiscount() {
		int discountRate=15;
		int discountAmount=amount-(amount*discountRate/100);
		int finalPrice= discountAmount;
		return finalPrice;
	}


	public static void main(String[] args) {
		CycleDiscount discount = new CycleDiscount(10000);
		
		int result = discount.cycleDiscount();
		
		System.out.println("The amount is ="+discount.amount);
		System.out.println("The value  after the discount is ="+result);
		
	}

}
