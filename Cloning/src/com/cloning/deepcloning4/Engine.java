package com.cloning.deepcloning4;

public class Engine implements Cloneable
{
	int power;
	String enginetypes;
	public Engine(int power, String enginetypes) {
		super();
		this.power = power;
		this.enginetypes = enginetypes;
	}
	@Override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
	

}
