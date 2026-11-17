package com.cloning.deepcloning4;

public class Car implements Cloneable {
	String name;
	String engineType;
	int model;
	Engine engine;
	public Car(String name, String engineType, int model, Engine engine) {
		super();
		this.name = name;
		this.engineType = engineType;
		this.model = model;
		this.engine = engine;
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException{
		Car car = (Car) super.clone();
		car.engine =(Engine) engine.clone();
		return car;
	}

}
