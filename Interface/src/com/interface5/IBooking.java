package com.interface5;

public interface IBooking {
	//What to do
	 public  abstract  Booking book();
	public abstract void cancelBooking();
	public abstract Booking checkStatus();
	SearchResult search();
	
	//Optional---2010
	public default void autoUpgrade() {
		System.out.println("IBooking.autoUpgrade().......");
	}

}
