package com.interface3;

public class Smartphone implements ICamera,IMusic{

	@Override
	public void performMusic() {
		// TODO Auto-generated method stub
		System.out.println("It will click the photos ");
		
	}

	@Override
	public void fuctionCamera() {
		// TODO Auto-generated method stub
		System.out.println("It will perform music");
		
	}

}
