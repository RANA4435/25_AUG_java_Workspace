package com.exception.handling1;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("The main started");
		Arithmetic ar = new Arithmetic();
		ar.doCalculate(10, 0);
		System.out.println("The main Ended");
		
		
	}
	public void doCalculate(int a,int b) {
		System.out.println("Started the method");
		
		try {
		System.err.println("The addition of the two number is ="+(a+b));
		}
		catch(ArithmeticException e) {
			System.out.println("We are trying to perform the operation with two number");
			e.printStackTrace();
		}
		try {
		System.out.println("The Substraction of a two number is ="+(a-b));
		}
		catch(ArithmeticException e) {
			System.out.println("we are perform the operation");
			e.printStackTrace();
			
		}
		try {
		System.out.println("The the Division of a two  number is = "+(a/b));
		}
		catch(ArithmeticException e) {
			System.out.println("We are performing some task on this ");
			e.printStackTrace();
		}
		
		
		System.out.println("Ended the method");
	}

}
