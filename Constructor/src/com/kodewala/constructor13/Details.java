package com.kodewala.constructor13;

public class Details extends Student {
	int fees;
	public Details(String _name,int _age,int _marks,int _section,String _character,int _fees) {
		super(_name,_age,_marks,_section,_character);
		this.fees=_fees;
	}
	

}
