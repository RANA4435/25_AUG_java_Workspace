package com.inheritence.single;

class Animal{
	void eat(String name) {
		System.out.println("Animal is gettting distict from Earth:"+name);
	}
}
class Dog extends Animal{
	
	void bark(boolean yes) {
		System.out.println("Dog used to bark whenever he saw the person  who is new to him");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		
		animal.eat("Happy");
		
		Dog dog = new Dog();
		
		dog.bark(true);
		

	}

}
