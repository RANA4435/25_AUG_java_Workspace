package com.stat.method1;

public class Discount {

	public static void doDiscount(int price,int amount) {
		price =  price-(price-10/100);
		System.out.println("the discount...");
	}

}
class Driver {
	public static void main(String[] args) {
		Discount dis = new Discount();
		dis.doDiscount(100, 40);
	}
}
