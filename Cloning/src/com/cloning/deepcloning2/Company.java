package com.cloning.deepcloning2;

public class Company implements Cloneable {
	String companyName;
	String companyLocation;
	public Company(String companyName, String companyLocation) {
		super();
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
