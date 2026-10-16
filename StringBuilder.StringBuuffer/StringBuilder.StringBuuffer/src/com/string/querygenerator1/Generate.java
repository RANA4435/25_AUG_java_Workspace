package com.string.querygenerator1;

public class Generate {
	public StringBuilder generateQuery(int amount, String EmpId) {
		StringBuilder query=new StringBuilder("Select*From ");
		if(amount>0) {
			query.append("where salary="+amount);
		}else if(EmpId !=null) {
			query.append("Where is employee = "+EmpId);
		}else {
			query.append(";");
		}
		return query;
	}

}
