package com.polymorphism8;

public class Add extends Calculator {
	@Override
	public void doCalculate(int a,int b) {
		System.out.println("The calculation of a two number is:"+(a+b));
	}

}
