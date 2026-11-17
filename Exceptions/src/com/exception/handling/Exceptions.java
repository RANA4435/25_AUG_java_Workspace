package com.exception.handling;
class Account{
	
}

public class Exceptions {
	public static void main(String[] args) {
		System.out.println("The Start of the programming");
		 Account account=null;
		//String name="Kamdev";// but what will happens when we make it null 
		//lets take an example 
		//and finding the length
		 
		 
		 // taking an example of command line arguments
		 
		 String address=args[0];
		 String address1=args[1];
		 
		 
		 System.out.println("The address of the first one is ="+address);// passing the arguments as ranchi it started working but when i passed the it started giving an error array.out.ofindexBound
		 System.out.println("the Adddress of the second one is ="+address1);// instead of passing the String arguments i just passed the number it started giving the error NumberFormatException
		 
		 
		 int number=100;
		 int part=0;
		 int totalPart=100/part;
		 
		 System.out.println("print the total part ="+totalPart);//it started throwing java.lang.ArithmeticException:
		 
		 System.out.println("We kept the account null so the ="+account.hashCode());// java.lang.NullPointerException
		 
		 
		String name=null;
		
		System.out.println("name of the person is ="+name.length());// it is started throwing the java.lang.NullPointerException
				
		
		
		System.out.println("The End  of the program");
	}
	

}
