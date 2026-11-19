package com.exception.handling2;

public class AccountMgmt {

	public void openAccount(String name, String address) {
		System.out.println("Started openAccount ");

		activateAccount("6538763879");

		System.out.println("End of the openAccount");

	}

	private void activateAccount(String accNo) {
		System.out.println("AccountMgmt.activate start..");
		try {
			checkAccountStatus(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("AccountMgmt.activate End");

	}

	private boolean checkAccountStatus(String accNo) throws Exception {
		try {
			accNo.startsWith("SBI");// risky code

		} catch (NullPointerException e) {
			// throw create the new Exception Object and throw it to the caller
			throw new Exception("Account Number should starting with SBI" );
		}
		return false;
	}

}
