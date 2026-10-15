package com.encapsulation7;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		private int balance;
//		private String account;
//		private String name;
		
		Payment payment = new Payment(30000,"54545364654","Kamdev");
		
		System.out.println(payment.getBalance());

	}

}
