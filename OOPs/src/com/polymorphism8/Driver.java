package com.polymorphism8;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // i have written the code of method Overriding polymorphism so it is  a compile time polymorphism
		Calculator cal = new Calculator();
		cal.doCalculate(3, 5);
		
		Calculator cal1 =new Add();// Auto-Upcasting
		cal1.doCalculate(2, 8);
//		
//		Calculator calc2 = new Subtract();
//		calc2.

	}

}
