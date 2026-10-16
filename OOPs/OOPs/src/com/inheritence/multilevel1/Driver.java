package com.inheritence.multilevel1;

class Animal{
	void eat() {
		System.out.println("Some animal are omnivores and some are carnivores and some are herbivores");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog used to bark whenever it saw the new person");
	}
}
class Lion extends Animal{
	void roar() {
		System.out.println("The Lion roar can reach upto 5km");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		
		animal.eat();
		
		Dog dog = new Dog();
		
		dog.bark();
		
		Lion lion = new Lion();
		
		lion.roar();

	}

}
