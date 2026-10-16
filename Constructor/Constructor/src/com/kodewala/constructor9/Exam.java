package com.kodewala.constructor9;

public class Exam extends Students{
	int fees;
	public Exam(String _name,int _age,int _marks,int _section,String _course, int _rollNo, int _fees) {
		super(_name,_age,_marks,_section,_course,_rollNo);
		this.fees=_fees;
	}

}
