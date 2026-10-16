package com.string;
class Details {
	 String name;

	public Details(String name) {
		super();
		this.name = name;
	}
	
}

public class Driver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String csk="Chennai";
		String rcb="Bangalore";
		String pbks="Punjab Kings";
		String kkr="Kolkata knight Riders";
		String mi="Mumbai Indians";
		String lsg="Lucknow super Giants";
		String dd="Delhi Capitals";
		String rr="Rajasthan Royals";
		String srh="Sunrises Hyderabad";
		String gt="Gujarat Titans";
		
		
		System.out.println(csk==rcb);
		System.out.println(rr.equals(srh));
		
		String kk=new String("Kolkata");
		String cs=new String("Chennai");
		
		System.out.println(kk==cs);
		System.out.println(cs.equals(kk));
		
		Details user=new Details("Kamdev");
		Details user1=new Details("Salman");
		Details user2=new Details("Kamdev");
		
		System.out.println("This is from the User class");
		System.out.println(user==user1);
		System.out.println(user==user2);
		System.out.println(user.equals(user2));
		
		
		System.out.println("THE END");
		
		
		System.out.println("Always Stay positive And Never mix with the people who used to talk to Only Negative things");
				

	}

}
