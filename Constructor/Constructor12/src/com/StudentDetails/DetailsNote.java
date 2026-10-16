package com.StudentDetails;

public class DetailsNote {
	public void sendNotification(String _type) {
		System.out.println("Details.sendNotification");
		if(_type.equalsIgnoreCase("number")) {
			sendNumber();
		}else if(_type.equalsIgnoreCase("Account")) {
			sendAccount();
		}else {
			sendEmail();
		}
	}private void sendNumber() {
		System.out.println("Details.sendNumber() START");
		//
		System.out.println("Details.sendNumber() END");
	}private void sendAccount() {
		System.out.println("Details.sendAccount() START");
		//
		System.out.println("Details.sendAccount() END");
	}private void sendEmail() {
		System.out.println("Details.sendEmail() START");
		//
		System.out.println("Details.sendEmail() End");
	}

}
