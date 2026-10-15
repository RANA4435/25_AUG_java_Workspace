package com.loop2;

public class Driver {
	public static void main(String args[]) {
		AccountInfo pp[]=new AccountInfo[4];
		
//		String name;
//		String accNo;
//		int balance;
//		String sender;
//		String reciever;
//		int amount;
//		
		AccountInfo pp1=new AccountInfo("Amar","7645654673",100000,"Salman","Kamdev",16000);
		AccountInfo pp2=new AccountInfo("Aradhana","764565443",150000,"Kamdev","Aamir",169000);
		AccountInfo pp3=new AccountInfo("Satish","76453444673",1040000,"Dhyanchand","Mahadev",16000);
		AccountInfo pp4=new AccountInfo("kaif","764575754673",100690,"Shakib","Mehrudin",16000);
		
		
		for(int i=0;i<pp.length;i++) {
			if(pp[i].balance<15000) {
				System.out.println("Print the value="+pp[i].balance);
				System.out.println("Print the name="+pp[i].name);
			}
		}
	}

}
