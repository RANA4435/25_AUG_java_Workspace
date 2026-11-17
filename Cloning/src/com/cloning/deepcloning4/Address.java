package com.cloning.deepcloning4;

public class Address  implements Cloneable{
	String line ;
	String line2;
	public Address(String line, String line2) {
		super();
		this.line = line;
		this.line2 = line2;
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}

}
