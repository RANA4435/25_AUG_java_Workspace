package com.exception.handling;

public class NullPoint {
	public static void main(String[] args) {
		System.out.println("startde the main");
		NullPoint nul = new NullPoint();
		
		
		
		System.out.println("End the main");
	}
	public void doSometghing() {
		System.out.println("the starting point of the doSomething");
		
		String name= null;
		
		try {
			System.out.println(name.length());
			
			
		}catch(NullPointerException e) {
			System.out.println("name can not be null find the length");
			e.printStackTrace();
			
		}
		System.out.println("The end of the doSomething");
	}

}
