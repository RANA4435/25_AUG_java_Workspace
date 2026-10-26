package com.stat.method;
class Calculator{
	int amount ;
	
	public static void add(int a,int b) {
		System.out.println("The calculation of two number is :"+(a+b));
	}
}

public class Driver {
	public static void main(String[] args) {
		// in static method we do not need to create a object to call it
		Calculator.add(3, 7);
	}

}
