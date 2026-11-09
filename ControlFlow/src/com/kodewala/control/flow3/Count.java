package com.kodewala.control.flow3;

public class Count {
	int amount;
	String name;
	
	static int count=0;
	

	public Count(int amount, String name) {
		super();
		this.amount = amount;
		this.name = name;
		
		count++;
	}


	public static void main(String[] args) {
		Count counts= new Count(1000,"Kamdev");
		Count counts1= new Count(2000,"Suraj");
		Count counts2 = new Count(3000,"Satish");
		Count counts3 = new Count(4000,"Dilip");
		
		System.out.println("The total numbers of objects got created is ="+Count.count);

	}

}
