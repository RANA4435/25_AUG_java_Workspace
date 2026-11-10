package com.loop9;

public class Operation {
	int number1;
	int number2;
	
	public Operation(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	public void addition() {
		System.out.println("The addition of the two number is ="+(number1+number2));
	}
	public void subtratct() {
		System.out.println("The subtract of the two number is ="+(number1-number2));
	}
	public void multi() {
		System.out.println("The Multiplication of the two number is ="+(number1*number2));
	}

	public static void main(String[] args) {
		Operation oper= new Operation(10,20);
		 
		oper.addition();
		
	}

}
