package com.polymorphism.Overloading;

public class Calculator {
    //compile- time polymorhism
	public void doCalculate() {
		System.out.println("The calculation of a number is :");
	}
	public void doCalculate(int a,int b) {
		System.out.println("The add of a two number is :"+(a+b));
	}
	public void doCalculate(int a) {
		System.out.println("The Square of a number is :"+(a*a));
	}

}
