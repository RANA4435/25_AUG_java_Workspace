package com.inheritence.single1;

class Vehicle{
	void body(){
		System.out.println("Whenever the vehicle got manufactured it manufactured with body");
	}
}

class Car{
	void run() {
		System.out.println("It consume diesel or Petrol to run");
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle veh = new Vehicle();
		
		veh.body();
		
		Car car = new Car();
		
		car.run();

	}

}
