package com.interface2;

public class CreditCard  implements IOrderPay{

	@Override
	public int orderPayment(int amount, int rate) {
		int finalAmount = amount-(amount*rate/100);
		return finalAmount;
	}

}
