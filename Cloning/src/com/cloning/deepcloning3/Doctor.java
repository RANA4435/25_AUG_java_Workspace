package com.cloning.deepcloning3;

public class Doctor implements Cloneable{
	String doctorName;
	String specialization;
	int experience;
	
	Hospital hospital;

	public Doctor(String doctorName, String specialization, int experience, Hospital hospital) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.experience = experience;
		this.hospital = hospital;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Doctor doctor = (Doctor) super.clone();
		doctor.hospital=(Hospital) hospital.clone();
		
		return doctor;
	}

}
