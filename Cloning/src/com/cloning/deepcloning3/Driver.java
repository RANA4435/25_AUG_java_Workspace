package com.cloning.deepcloning3;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Hospital hospital = new Hospital("Clinic", "Ranchi");
		
		Doctor doctor = new Doctor("Vishwajit", "Bhagalpur", 10, hospital);
		
		Doctor clonedObj = (Doctor) doctor.clone();
		
		System.out.println(clonedObj.hospital.hospitalName);
		System.out.println(doctor.hospital.hospitalName);
		
		clonedObj.hospital.hospitalName="Sita clinic";
		
		System.out.println(clonedObj.hospital.hospitalName);
		System.out.println(doctor.hospital.hospitalName);
	}

}
