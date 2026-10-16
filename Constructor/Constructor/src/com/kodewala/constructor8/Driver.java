package com.kodewala.constructor8;
//String name;
//String item;
//int quantity;
//int price;
//String payment;

public class Driver {
	public static void main(String args[]) {
		Flipkart pp=new Flipkart("Millets","Millets s",1,199,"online",266);
		System.out.println(pp.name);
		System.out.println(pp.item);
		System.out.println(pp.quantity);
		System.out.println(pp.price);
		System.out.println(pp.payment);
		System.out.println(pp.amount);
	}

}
