package com.inheritence5;

public class Dog extends Animal {
	boolean bark;
	String loyal;
	public Dog(String name, String colour, String size, boolean bark, String loyal) {
		super(name, colour, size);
		this.bark = bark;
		this.loyal = loyal;
	}
	
	public void viewDogBehavior() {
		System.out.println("Name of the animal:"+name);
		System.out.println("Colour of the animal:"+colour);
		System.out.println("Size of the animal:"+size);
		
		System.out.println("Dog is very loyal:"+bark);
		System.out.println("Loyal towards thier owner:"+loyal);
	}

}
