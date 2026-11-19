package com.exception.handling.custom;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String msg) {
		super(msg);
	}

}
