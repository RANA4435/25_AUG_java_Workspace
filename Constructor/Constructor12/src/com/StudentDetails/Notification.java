package com.StudentDetails;

public class Notification {
	public void NotificationService(String _type) {
		System.out.println("Notification.NotificationService");
		if(_type.equalsIgnoreCase("email")) 
		{
			sendEmail();
		}else if(_type.equalsIgnoreCase("sms")) 
		{
			sendSMS();
		}else 
		{
			sendWhatsApp();
		}
	}private void sendEmail() {
		System.out.println("Notification.sendEmail()START");
		//
		System.out.println("Notification.sendEmail() END");
	}
	private void sendSMS() {
		System.out.println("Notification.sendSMS() START");
		//
		System.out.println("Notification.sendSMS() END");
	}
	private void sendWhatsApp() {
		System.out.println("Notification.sendWhatsApp() START");
		//
		System.out.println("Notification.sendWhatsApp() END");
	}
}