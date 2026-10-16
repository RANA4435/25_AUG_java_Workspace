package com.StudentDetails;

public class AccountDetails {
	public static void main(String args[]) {

		Bank acc = new Bank("kamdev", "664647746474", 55353636);
		System.out.println(acc.name + " " + acc.accountNumber + " " + acc.amount);

		Bank acc1 = new Bank("salman", "64647848373");
		System.out.println(acc1.name + " " + acc1.accountNumber);

		Bank acc2 = new Bank("5484878487", 535337);
		System.out.println(acc2.accountNumber + " " + acc2.amount);

		Bank acc3 = new Bank(664747, "sandeep");
		System.out.println(acc3.name + " " + acc3.amount);

		Bank acc4 = new Bank(635646,"Dilip");
		System.out.println(acc4.name + " " + acc4.amount);

		Bank acc5 = new Bank();
		
		System.out.println("hello");
	}

}
