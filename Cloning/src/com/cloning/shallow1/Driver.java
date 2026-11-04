
package com.cloning.shallow1;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		Grass grass = new Grass("Red", "Yes, this grass is eatable", "Very tasty");

		Animal animal = new Animal("Happy", "Blue", grass);

		Animal clonedObj = (Animal) animal.clone();

		System.out.println("Original Grass Colour: " + animal.grass.grassColour);

		System.out.println("Cloned Grass Colour: " + clonedObj.grass.grassColour);

		// Changing original object's nested Grass
		animal.grass.grassColour = "Green";

		System.out.println("After Modification:");

		System.out.println("Original: " + animal.grass.grassColour);

		System.out.println("Cloned: " + clonedObj.grass.grassColour);
	}
}