package com.array.kodewala1;

public class Driver {

	public static void main(String[] args) {
		
       Account acc1=new Account("kodewala",864849389);
       Account acc2=new Account("Amir",55436545);
       Account acc3=new Account("salman",5544454);
       Account acc4=new Account("Sonu",365735735);
       
       Account acc[]=new Account[5];
       
       acc[0]=acc1;
       acc[1]=acc2;
       acc[2]=acc3;
       acc[3]=acc4;
       
       for(int i=0;i<acc.length;i++) {
    	   System.out.println("Print the Array="+acc[i].name);
       }
	}

}
