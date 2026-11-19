package com.exception.handling.custom;

public class InvalidPaymentException  extends Exception{
	public InvalidPaymentException(String msg) {
		super(msg);
	}

}
