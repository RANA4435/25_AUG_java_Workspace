package com.polymorphism8;

public class Multiple  extends Calculator {
	@Override
	public void doCalculate(int a,int b) {
		System.out.println("The calculation of a two number after multiplication is :"+(a*b));
	}
}
