package com.string.querygenerator2;

public class Genarate {
	public StringBuilder genarateQuery(int age, String Id, String Acc,int salary) {
	     StringBuilder kk=new StringBuilder("Select * From");
	     
	     if(age>20) {
	    	 kk.append(" Eligible = "+age);
	     }else if(Id!=null) {
	    	 kk.append(" Id should not be the null ="+Id);
	    	  
	     }else if(Acc!=null) {
	    	 kk.append(" Acc no:-  ="+Acc);

	     }else if(salary>0) {
	    	 kk.append(" salary ="+salary);

	     }
	     return kk;
	}
}
