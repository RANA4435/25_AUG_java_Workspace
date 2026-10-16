package com.string.querygenerator;

public class QueryGenarator {
	public StringBuilder generateQuery(int salary, String empID) {
		StringBuilder query=new StringBuilder("Select * From employee");
		
		if(salary>0) {
			query.append("where salary = "+salary+";");
		}else if(empID !=null) {
			query.append("where empID ="+empID +";");
			
		}else {
			query.append(";");
		}
		return query;
		
	}

}
