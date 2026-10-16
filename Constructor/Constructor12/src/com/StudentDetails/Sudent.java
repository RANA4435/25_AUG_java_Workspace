package com.StudentDetails;

public class Sudent {
	String name;
	int marks;
	int age;
	String section;
	
	
	Sudent(String _name,int _marks,int _age,String _section){
		this.name=_name;
		this.marks=_marks;
		this.age=_age;
		this.section=_section;
	}
    Sudent(String _name,int _age){
    	this.name=_name;
    	this.age=_age;
		
	}
    Sudent(){
		
	}
}
