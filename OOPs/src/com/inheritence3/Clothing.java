package com.inheritence3;

public class Clothing extends ProductName {
	String colour;
	int size;
	public Clothing(String productName, String address, int price, String buyerName, String description, String colour,
			int size) {
		super(productName, address, price, buyerName, description);
		this.colour = colour;
		this.size = size;
	}
	
	public void viewClothDetails() {
		System.out.println("Product name:"+productName);
		System.out.println(" Address:"+address);
		System.out.println(" Price:"+price);
		System.out.println(" Buyer:"+buyerName);
		System.out.println(" Description:"+description);
		
		
		System.out.println("Colour of the product:"+colour);
		System.out.println("What  is the size of the product:"+size);
	}
	

}
