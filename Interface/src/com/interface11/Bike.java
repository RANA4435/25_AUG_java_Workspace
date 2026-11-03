package com.interface11;

public class Bike implements Vehicle {
	public void horn() {
		//System.out.println("Bike make me little bit uncomfortale");
		
		Vehicle.super.horn()	;	
		
	}

}
