package com.cloning.deepcloning3;

public class DriverMemoryLeak {
	//Making it global so that it can be used for multiple times
	Hospital hospital;
	Doctor doctor;
	Doctor clonedObj;
	
	
	public  void main(String[] args) throws CloneNotSupportedException {
		 hospital = new Hospital("Clinic", "Ranchi");
		
		 doctor = new Doctor("Vishwajit", "Bhagalpur", 10, hospital);
		
		 clonedObj = (Doctor) doctor.clone();
		
		System.out.println(clonedObj.hospital.hospitalName);
		System.out.println(doctor.hospital.hospitalName);
		
		hospital=null;//hospital objects becomes null so that the GC can removed the unused object from the class
		doctor=null;//doctor objects becomes null so that the GC can removed the unused object from the class

     }
	public  static void  main1(String[] args) throws CloneNotSupportedException{
		
	}
}
