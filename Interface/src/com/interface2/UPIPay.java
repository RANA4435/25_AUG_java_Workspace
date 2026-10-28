package com.interface2;

public class UPIPay implements IOrderPay{

	@Override
	public int orderPayment(int amount, int rate) {// this is what i  have inherited
		int finalfare;// this is logic part which i have performed
		if (amount >= 5000) {
            finalfare = amount - (amount * rate / 100);
        } else if (amount >= 1000) {
            finalfare = amount - (amount * 5 / 100);
        } else {
            finalfare = amount;
        }
		return finalfare;
	}

}
