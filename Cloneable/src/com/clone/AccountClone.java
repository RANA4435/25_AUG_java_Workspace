package com.clone;

public class AccountClone  implements Cloneable{
	String name;
	String id;
	public AccountClone(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	 @Override
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

}
