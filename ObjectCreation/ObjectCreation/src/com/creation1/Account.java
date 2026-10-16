package com.creation1;
class AccountMgmt
{
	static 
	{
		System.err.println("Account.SIB");
	}
}

public class Account extends AccountMgmt {
	String AccoutnNumber;
	//instance init block
	{
		System.out.println("Account IIB");
		
	}
	public Account(String accoutnNumber) {
		super();//1st line
		//Account IIb--> 2nd line
		System.out.println("AccountNumber");
		AccoutnNumber = accoutnNumber;
	}
	

}
