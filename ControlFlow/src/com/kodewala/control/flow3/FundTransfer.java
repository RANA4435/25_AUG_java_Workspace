package com.kodewala.control.flow3;

public class FundTransfer {
	
	
	public void transfer(String name, String accNo,int amount){
		
		if(amount >1000) {
			System.out.println("Amount to be transfer"+amount);
		}else {
			System.out.println("the amount is not sufficient to transfer");
		}
		
	}
	public static void main(String args[]) {
		FundTransfer fundtransfer = new FundTransfer();
		fundtransfer.transfer("kamdev", "36129887217", 10000);
	}

}
