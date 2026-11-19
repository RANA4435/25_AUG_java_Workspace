package com.exception.handling3;

import javax.naming.InsufficientResourcesException;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Started Main");
		PaymentMgmt pay = new PaymentMgmt();
		try {
			pay.doPayment("52367567356357", 1200);
		} catch (InsufficientResourcesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END of the Main");
		
	}

}
