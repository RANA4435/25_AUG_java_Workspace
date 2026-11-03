package com.interface11;

public interface Vehicle {
	//taking an example of default keyword
	
	default void brake() {
		System.out.println("Apply the brake before you feel that something is going to happen");
	}
	
	default void horn() {
		System.out.println("Apply the horn");
		
	}

}
