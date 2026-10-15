package com.kodewala.constructor6;

public class Driver {
	public static void main(String args[]) {
		ElectronicProduct  electronic=new ElectronicProduct("iphone",18800,"c573",2);
		System.out.println(electronic.name);
		System.out.println(electronic.price);
		System.out.println(electronic.productId);
		System.out.println(electronic.warranty);
	}

}
