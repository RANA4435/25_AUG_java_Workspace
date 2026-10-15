package com.encapsulation2;

public class Payment {
   private int balance;
   private String name;
   private String accountHolder;
   public Payment(int balance, String name, String accountHolder) {
	super();
	this.balance = balance;
	this.name = name;
	this.accountHolder = accountHolder;
   }
   
   
   public void showBalance() {
	   System.out.println("Balance: "+balance+"\nName:"+name+"\nAccount Holder:"+accountHolder);
   }
   
   public void withdraw(int amount) {
	   if(balance >= amount) {
		   System.out.println("Before Update Balance" +balance);
		   balance -= amount;
		   System.out.println("Updated Balance" +balance);
	   }
	   else {
		   System.out.println("Insufficent Balance"+balance+" !");
		   
	   }
   }

}
