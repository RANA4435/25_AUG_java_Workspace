package com.interface1;

public class Driver1 {
	public static void main(String[] args) {
		Arithmetic ar =(a,b)->{
			System.out.println("The multipliaction of two number is ="+(a*b));
		};
		ar.doCalculate(10, 14);
	}

}
