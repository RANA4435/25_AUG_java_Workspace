package com.StudentDetails;

public class InvoiceApp {
	public static void main(String args[]) {
		
		NotificationService kr=new NotificationService();
		kr.sendNotification("email");
		kr.sendNotification("sms");
		kr.sendNotification("");
		
	
	}

}
