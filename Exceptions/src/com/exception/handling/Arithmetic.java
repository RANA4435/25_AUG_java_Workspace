package com.exception.handling;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("Started the main()");
		Arithmetic ar = new Arithmetic();
		ar.doSomething();
		
		System.out.println("The End  of the main()");
		
		
		
	}
	public void doSomething() {
		System.out.println("The starting point of the doSomething");
		
		int amount = 100;
		
		try {
			System.out.println(100/0);
			System.out.println("What will be the output");
		}catch(ArithmeticException e) {
			System.out.println("100 can not be divisible by 0");
			e.printStackTrace();
			
		}
		System.out.println("The ending point of the doSomething");
	}

}
