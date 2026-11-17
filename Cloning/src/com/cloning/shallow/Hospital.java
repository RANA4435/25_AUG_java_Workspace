package com.cloning.shallow;

public class Hospital  implements Cloneable{
	String name;
	int dateOfEst;
	Place place;
	public Hospital(String name, int dateOfEst, Place place) {
		super();
		this.name = name;
		this.dateOfEst = dateOfEst;
		this.place = place;
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}

}
