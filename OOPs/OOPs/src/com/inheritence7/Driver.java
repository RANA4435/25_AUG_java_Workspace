package com.inheritence7;

class Animal{
	public void animal(String name) {
		System.out.println("Animal.animal");
	}
}
class Dog extends Animal{
	@Override
	public void animal(String name) {
		System.out.println("Dog.animal");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		
		animal.animal("Happy");

	}

}
