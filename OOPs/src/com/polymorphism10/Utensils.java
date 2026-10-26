package com.polymorphism10;

public class Utensils  extends Order{
	@Override
	public void doOrder(String name,int amount,int quantity) {
		System.out.println("The order of the utensils from near by shop");
	}

}
