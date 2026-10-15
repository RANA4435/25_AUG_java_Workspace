package com.kodewala.control.flow;

public class MakeTrip {
	public  String discountApply(int amount) {
		String discount=null;
		
		if(amount<5000) {
			discount="sorry You are not applicable for the discount";
		}
		else if(amount>=5000 && amount<10000) {
			discount="you get 10% discount on your trip";
		}
		else if(amount>=10000 && amount<15000) {
			discount="you get 15% discount on your trip";
		}
		else {
			discount="Maximum discount for the our customer is 1250 only";
		}
		return discount;
	} 
	

}
