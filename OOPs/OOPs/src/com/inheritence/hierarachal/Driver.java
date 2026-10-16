package com.inheritence.hierarachal;

class Product {
	public void productsName(String name) {
		System.out.println("Product.productName");
	}
}

class Item extends Product{
	@Override
	public void productsName(String name) {
		System.out.println("Item.productName");
	}
}

class Grocery extends Product{
	@Override
	public void productsName(String name) {
		System.out.println("Grocery.productName");
	}
}

class Dahi extends Item{
	public void productQuality(String quality) {
		System.out.println("Dahi.productname");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product pro = new Product();
		
		//pro.productsName("Iphone");
		
		Dahi dahi = new Dahi();
		
		dahi.productQuality("The Quality of this Dahi is very good");

	}

}
