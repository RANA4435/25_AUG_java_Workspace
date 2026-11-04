package com.account;

import java.io.Serializable;

public class Bank  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private transient String accNo;
	public Bank(String name, String address, String accNo) {
		super();
		this.name = name;
		this.address = address;
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	

}
