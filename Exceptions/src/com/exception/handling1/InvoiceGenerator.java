package com.exception.handling1;

public class InvoiceGenerator {
	
	public void generateInvoice() {
		//get the customer details from the dbCommection
		//[Connect with database ---> create db connection]
		//get details from the db
		try {
			dbConnection();
			String name=null;
			name.lastIndexOf("a");
			System.out.println("GEnerating the invoice ...");
			//closing 
			closeDBConnection();
		}
		catch(Exception e) {
			System.out.println("Some Exception");
			e.printStackTrace();
		}
		finally {//mandatory block it will execute if their is exception or not
			System.out.println("I am inside the block ");
		}
		
		
	}
	private void dbConnection() {// making connection to the database
		
	}
	private void closeDBConnection() {// create a method for closing the connection from the db
		
	}

}
