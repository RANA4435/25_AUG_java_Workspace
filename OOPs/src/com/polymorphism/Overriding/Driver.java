package com.polymorphism.Overriding;

// method Overriding that is run-time poly
class Car{
	public boolean doBrake() {
		System.out.println("Take  brake a brake in the car...");
		return true;
	}
}
class Bike extends Car{
	@Override
	public boolean doBrake() {
		System.out.println("Take  brake in the bike...");
		return true;
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.doBrake();
		
		Car car2 = new Bike();
		car2.doBrake();
	}

}
