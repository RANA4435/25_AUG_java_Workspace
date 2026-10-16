package com.loop4;

public class Driver {
//	String name;
//	String accNo;
//	String sender;
//	String reciever;
//	int balance;

	public static void main(String[] args) {
		Account kk[]=new Account[3];
		
		Account kk1=new Account("kamdev","5556656665","kamdev","sunil",14300);
		Account kk2=new Account("Ramu","555543545","Roshan","sandeep",14200);
		Account kk3=new Account("Matar","5556856565","Motu","rakesh",14100);
		
		kk[0]=kk1;
		kk[1]=kk2;
		kk[2]=kk3;
		
		
		for(int i=0; i<kk.length;i++) {
		  if(kk[i].balance>14000) {
			  System.out.println("print the balance="+kk[i].balance);
			  System.out.println("Name="+kk[i].name);
		  }	
		}


	}

}
