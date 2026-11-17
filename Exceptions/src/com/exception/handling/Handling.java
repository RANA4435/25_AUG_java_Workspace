package com.exception.handling;

public class Handling {
	public void doSomething(int amount) {
		if(amount>10) {
			System.out.println("Print the value ="+amount);
		}else {
			System.out.println("The amount is more then the input");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("The start");
		Handling handle = new Handling();
		
		handle.doSomething(10);
		System.out.println("The End");
	}

}
