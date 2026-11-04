package com.clean;

public class Driver {

	public static void main(String[] args) {
		User user = new User("Rana", "KD55454");
		
		DataCleaner cleaner = new DataCleaner();
		
		cleaner.clean(user);

	}

}
