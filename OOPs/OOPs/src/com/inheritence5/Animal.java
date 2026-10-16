package com.inheritence5;

public class Animal {
	String name;
	String colour;
	String size;
	public Animal(String name, String colour, String size) {
		super();
		this.name = name;
		this.colour = colour;
		this.size = size;
	}
	
	public void viewBehavior() {
		System.out.println("Name of the animal:"+name);
		System.out.println("Colour of the animal:"+colour);
		System.out.println("Size of the animal:"+size);
	}

}
