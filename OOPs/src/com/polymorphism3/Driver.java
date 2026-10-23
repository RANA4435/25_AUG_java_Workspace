package com.polymorphism3;
class Calculator{
	public void doCalculate(int a,int b) {
		System.out.println("The calculation....");
	}
}
class Add extends Calculator{
	@Override
	public void doCalculate(int a, int b) {
		System.out.println("The calcculation of two  number is "+(a+b));
	}
}
class Subtract extends Calculator{
	@Override
	public void doCalculate(int a, int b) {
		System.out.println("The calcculation of two  number is "+(a-b));
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator  calculator = new Calculator();
		
		Subtract sub = new Subtract();
		sub.doCalculate(8, 6);
		
		Calculator cal = new Subtract();//auto-upcasting
		cal.doCalculate(4, 5);
		
		Calculator add = new Add();
		add.doCalculate(4, 8);
		
//		Calculator calc2 = new Calculator();
//		Calculator subs = (Calculator)calc2;
//		subs.doCalculate(3, 6);
		
		Subtract subs = new Subtract();
		Calculator calc2 = subs;           
		Subtract subs2 = (Subtract) calc2; 
		subs2.doCalculate(3, 6);

	}

}
