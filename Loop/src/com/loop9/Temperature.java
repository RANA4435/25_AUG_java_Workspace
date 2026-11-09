package com.loop9;

public class Temperature {
	public static void main(String[] args) {
	
		
		int temperature=Integer.parseInt(args[0]);
		int humidity=Integer.parseInt(args[1]);
		
		if(temperature>30 && humidity==50) {
			System.out.println("Todays temperature and the humididty is above of 30 and 50");
		}else {
			System.out.println("The temperature is not above then 30 and 50");
		}
		
	}

}
