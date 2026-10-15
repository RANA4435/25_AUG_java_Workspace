package com.string.concat3;

class AccountMgmt// this class can not become parents
{
	final int UPI_Limit=100000;//constant in java
	
	public final void doSomething1() 
	{
		 UPI_Limit=200000;// able to change the value before the final after this if u need to change or assign the value u need to take the other variable
		 int UPI_Limit=2000000; // this is the example 
	}
	 public void doSomething2() 
	{
		// some function...
	}
	
}
class Account extends AccountMgmt
{
	@Override//method overriding
	public void doSomething2() 
	{
		// some function... do perform
		//If class is final You can not change the Extends the class
		//If the method is final you can not change the methods you can not Override the method
		//If variables is final you can not you can not modify it
		
		
		// So when we put the word final it can not be extend in class, Override in the method,and can not modify the value by using the same variable name
		// So when you have the word with final in java it is constant in java
		// So if you have constant in java the naming convencing start with capital hence Every letter should be with capital case
	}
	
	
}


public class Driver {
	public static void main(String args[]) 
	{
		
	}

}
