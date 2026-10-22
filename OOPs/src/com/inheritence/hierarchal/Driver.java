package com.inheritence.hierarchal;


class Account {
	public void openAccount(String name) {
		System.out.println("openAccount...."+name);
	}
    
}
class SavingAccount extends Account{
	public void savingAccount(int age) {
		System.out.println("SavingAccount..."+age);
	}
}
class SeniorCit extends Account{
	public void accountSeniorCit(String pan) {
		System.out.println("accountSeniorCit....."+pan);
	}
}
class PensionAccount extends SeniorCit{
	public void PensionAccount(long aadhar) {
		System.out.println("PensionAccount..."+aadhar);
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.openAccount("Kamdev");
		
		SavingAccount saving = new SavingAccount();
		saving.savingAccount(20);
		
		SeniorCit cit = new SeniorCit();
		cit.accountSeniorCit("GZIPR2667M");
		
		PensionAccount pension = new PensionAccount();
		pension.PensionAccount(856564925293L);

	}

}
