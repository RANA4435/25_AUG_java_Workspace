package com.StudentDetails;

public class NotificationApp {
	public static void main(String args[]) {
		Notification kk=new Notification();
		kk.NotificationService("sms");
		kk.NotificationService("email");
		kk.NotificationService("WhatsApp");
	}

}
