package com.polymorphism5;
class Payment {
	public void doPayment() {
		System.out.println("Payment is successful..");
	}
}
class DebitCard extends Payment{
	@Override
	public void doPayment() {
		System.out.println("Payment is successful..DebitCard");
	}
}
class CreditCard extends Payment{
	@Override
	public void doPayment() {
		System.out.println("Payment is successful..CreditCard");
	}
}
class UPIPayement extends Payment{
	@Override
	public void doPayment() {
		System.out.println("Payment is successful..UPIPayment");
	}
}
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment payment = new Payment();
		payment.doPayment();
		
		Payment payment1 =new DebitCard();
		payment1.doPayment();

	}

}
