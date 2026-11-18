package com.exception.handling1;

public class Calculate {
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		 int result =cal.doCalculate(100, 10);
		 System.out.println("The Calculate is ="+result);
		
	}
	private int doCalculate(int amount,int disc) {
		int  finalAmt=0;
		try {
			 finalAmt=amount-(amount*disc/100);//Risky code
			// String name=null;
			// name.length();
			return finalAmt;
		}
		catch(Exception e) {
			System.out.println("Some Exception may come");
			e.printStackTrace();
			
		}
		finally {
			finalAmt=110;
			//return finalAmt;//We are deciding the value with the return finalAmt
		}
		return finalAmt;
		
	}

}
