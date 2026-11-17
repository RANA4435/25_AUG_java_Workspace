package com.cloning.shallow;

public class Driver1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Place place = new Place("ranchi", "bangalore", "Koderma");
		
		Hospital hospital = new Hospital("Kamdev Clinic", 1990, place);
		
		Hospital cloneObj = (Hospital) hospital.clone();
		hospital.place.line2="BLR";
		
		System.out.println("The cloned object of the shallow cloning is ="+cloneObj.place.line2);
		System.out.println("The Original name of the hospital ="+hospital.place.line2);
	}

}
