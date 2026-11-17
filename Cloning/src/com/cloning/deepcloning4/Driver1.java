package com.cloning.deepcloning4;

public class Driver1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Engine engine = new Engine(1600, "Diesel");
		
		Car car = new Car("Supra", "elctric", 1990, engine);
		
		Car cloneObj = (Car) car.clone();
		
		car.engine.enginetypes="petrol";
		
		System.out.println("The original object is ="+cloneObj.engine.enginetypes);
		System.out.println("And After changing the value ="+car.engine.enginetypes);
	}

}
