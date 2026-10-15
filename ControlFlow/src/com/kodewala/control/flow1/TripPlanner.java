package com.kodewala.control.flow1;

public class TripPlanner {
	public String discountApply(int amount) {
		String discount=null;
		if(amount<5000) {
			discount="Sorry you are not eligible for the discount";
		}
		else if(amount>5000&& amount<8000) {
			discount="you will  get 5% discount on planning the trip";
		}
		else if(amount>8000 && amount<10000) {
			discount="Thanks booking the plan you can get upto 10% discount on your plan Booking";
		}
		else if(amount>10000 && amount<12000) {
			discount="Hello sir/ma'am you are the luckiest couple on the booking for the plan you are getting 15% flat off on your booking  ";
		}
		else if(amount <12000 && amount>15000) {
			discount="Thanks for booking the plan and choosing the plan in this place";
		}
		else if(amount <15000 && amount>17000) {
			discount="Grateful to you sir";
		}
		else if(amount>17000 && amount>20000) {
			discount="Sir these is our promise that you will get the best treatment from our staff";
		}
		else if(amount>20000 && amount<25000) {
			discount="You will get the best treatment and we will deliver the best from us";
		}
		return discount;
	}

}
