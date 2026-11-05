package com.cloning.deepcloning3;

public class Hospital  implements Cloneable{
	String hospitalName;

	String location;

	public Hospital(String hospitalName, String location) {
		super();
		this.hospitalName = hospitalName;
		this.location = location;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}


}
