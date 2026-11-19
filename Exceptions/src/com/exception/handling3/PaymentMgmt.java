package com.exception.handling3;

import javax.naming.InsufficientResourcesException;

public class PaymentMgmt {
	public void doPayment(String account, int amount) throws InsufficientResourcesException {
		//check the balance
		try {
			checkBalanceStatus(account, amount);
		}
		catch(InsufficientResourcesException e) {
			 throw new InsufficientResourcesException("you do not have the enough balance to make the transaction ");
		}
		
	}
	private boolean checkBalanceStatus(String account, int amount)throws InsufficientResourcesException {
		boolean checkBalanceStatus=false;
		int balance=1000;
				if(amount>balance) {
					//balance is not enough
					throw new InsufficientResourcesException(amount+"does not have enough balance="+balance);
				}else {
				   //allowed to transfer
					checkBalanceStatus=true;
				}
				return  checkBalanceStatus;
	
	}

}
