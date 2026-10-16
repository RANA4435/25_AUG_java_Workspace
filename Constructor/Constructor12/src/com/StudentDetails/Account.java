package com.StudentDetails;
class Kamdev extends Object{
	String name;
	String acc;
	String sender;
	String rec;
	int amount;
	public Kamdev(String name, String acc, String sender, String rec, int amount) {
		super();
		this.name = name;
		this.acc = acc;
		this.sender = sender;
		this.rec = rec;
		this.amount = amount;
	}
	Kamdev(){
		
	}
	Kamdev(String _name,String _acc){
		this.name=_name;
		this.acc=_acc;
	}
}

public class Account {
	public static void main(String[] args) {
		//Kamdev user2=new Kamdev("Suraj","5655655655");
		Kamdev user=new Kamdev("kamdev","763768364863","satish","akash",10000);
	    //Kamdev user1=new Kamdev();
	    
	    
		
	}

}
