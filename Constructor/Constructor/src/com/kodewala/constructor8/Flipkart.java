package com.kodewala.constructor8;
//String name;
//String item;
//int quantity;
//int price;
//String payment;

public class Flipkart extends Details{
	int amount;
	public Flipkart(String _name,String _item,int _quantity,int _price,String _payment,int _amount) {
		super(_name,_item,_quantity,_price,_payment);
		this.amount=_amount;
	}

}
