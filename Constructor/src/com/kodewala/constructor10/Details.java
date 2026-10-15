package com.kodewala.constructor10;
//String name;
//String storage;
//String colors;
//int price;
//int models;
//String processors;

public class Details extends Mobile {
	// this are instance variable
	int value;
	String _name;
	
	// The variables inside the details are the local variable
	 Details(String _name,String _storage,String _colors,int _price,int _models,String _processors,int _value ) {
		super(_name,_storage,_colors,_price,_models,_processors);
		this.value=_value;
		_name=_name;
		
		System.out.println("Printing through consturctor" + this._name);
	}

}
