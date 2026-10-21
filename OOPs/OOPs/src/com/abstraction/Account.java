package com.abstraction;

public class Account {
	public boolean openAccount(String name, String pan, String address) {
		validateNameAndAddress(name,pan);
		validatePan(pan);
		userId();
		notifyUser();
		return true;
	}
	private boolean validateNameAndAddress(String name, String pan) {
		return true;
	}
	public boolean validatePan(String pan) {
		return true;
	}
	public boolean userId() {
		return true;
	}
	public boolean notifyUser() {
		return true;
	}

}
