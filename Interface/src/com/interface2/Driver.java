package com.interface2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOrderPay order = new UPIPay();
		 int result=order.orderPayment(1000, 20);
		 System.out.println("The finalamount after the discount will be :"+result);

	}

}
