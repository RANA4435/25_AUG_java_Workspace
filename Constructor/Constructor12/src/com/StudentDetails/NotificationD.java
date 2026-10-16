package com.StudentDetails;


public class NotificationD {
	
	public void sendNotificationD(String _type) {
		 System.out.println("Notification.sendNotificationD");
		 if(_type.equalsIgnoreCase("age")) {
			 sendAge();
		 }else if(_type.equalsIgnoreCase("marks")) {
			 sendMarks();
		 }else if(_type.equalsIgnoreCase("roll")){
			 sendRoll();
		 }else if(_type.equalsIgnoreCase("fee")){
			 sendFee();
			 
		 }else if(_type.equalsIgnoreCase("result")){
			 sendResult();
		 }else{
			 sendEvent();
		 }
		 
		 
	}
	
	private void sendAge() {
		 System.out.println("Notification.sendAge() START");
		 //
		 System.out.println("Notification.sendAge() END");
	 }
	 private void sendMarks() {
		 System.out.println("Notification.sendMarks() START");
		 //
		 System.out.println("Notification.sendMarks() END");
	 }private void sendRoll() {
		 System.out.println("Notification.sendRoll() START");
		 //
		 System.out.println("Notification.sendRoll() END");
	 }private void sendResult() {
		 System.out.println("Notification.sendResult() START");
		 //
		 System.out.println("Notification.sendResult() END");
	 }private void sendFee() {
		 System.out.println("Notification.sendFee() START");
		 //
		 System.out.println("Notification.sendFee() END");
	 }private void sendEvent() {
		 System.out.println("Notification.sendEvent() START");
		 //
		 System.out.println("Notification.sendEvent() START");
	 }

}
