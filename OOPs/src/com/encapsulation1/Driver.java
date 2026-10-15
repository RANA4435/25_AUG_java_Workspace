package com.encapsulation1;

public class Driver {

	public static void main(String[] args) {
		Payment pp=new Payment(1000,"Salman","545655456535481");
		
		//System.out.println("Transaction is successful");
		pp.doPositive(-29);
		
		pp.doTransfer(100);
		
		
		System.out.println("Amount to be transfer:"+pp.getBalance());

	}

}
