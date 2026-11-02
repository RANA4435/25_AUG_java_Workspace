package com.interface5;

public interface IBooking {
	//What to do
	 public  abstract  Booking book();
	public abstract void cancelBooking();
	public abstract Booking checkStatus();
	SearchResult search();
	
	//Optional---2010
	public default void autoUpgrade() {
		//(checking the status,connected to DB)
		connectToDB();
		System.out.println("IBooking.autoUpgrade().......");
	}
	//optional
	public default void sendNotification() {
		//(connected to DB, sending the notification)
		connectToDB();
		System.out.println("IBooking.sendNotification().......");
	}
	//writing two default method in java 8 started giving problem of duplicacy
	//starting created a duplicacy so java 9 introduce private method to write in interface
	private void connectToDB() {
		System.out.println("Connecting to database..");
	}
	// common or utility method
	
	public static void printTicket(String path, String contents) {
	   System.out.println("printing the ticket...static method");
		
	}

}
