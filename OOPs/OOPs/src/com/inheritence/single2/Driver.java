package com.inheritence.single2;

class Plant{
	void water() {
		System.out.println("Consume sunlight for thier food preparation");
		}
	}
class Rose extends Plant{
	void smell(){
		System.out.println("The smell of Rose is very good ");
		
	}
}

public class Driver {
	public static void main(String[] args) {
		
		Plant plant = new Plant();
		
		plant.water();
		
	}

}
