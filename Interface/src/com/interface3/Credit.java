package com.interface3;

public class Credit  implements Payments{
	@Override
	public void doPayments(int amount) {
		System.out.println("The credit card payments is done of  ="+amount);
	}

}
