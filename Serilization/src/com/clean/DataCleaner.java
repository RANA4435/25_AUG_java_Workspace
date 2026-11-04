package com.clean;

public class DataCleaner {
	public void clean(Object object) {
		if(object instanceof Cleanable) {
			System.out.println("Allow to perform the data cleaning..");
		}else {
			System.out.println("Not allowed to perform the data cleaning..");
		}
	}

}
