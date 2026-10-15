package com.kodewala.constructor;

public class Details {
	public static void main(String args[]) {
		Student pp=new Student("kamdev", "c65748","He is a Good person actually",65);
		System.out.println(pp.name+" "+pp.customerId+" "+pp.behavior+" "+pp.age);
		Student kk=new Student(65,"salman");
		
		
		Student kkr=new Student( "V7647t64");
		System.out.println(kkr.customerId);
		
		
		Student ss=new Student("The person who used to play the cricket he is always stay fit and diseases free", "V7647t64");
		System.out.println(ss.behavior+" "+ss.customerId);
		
		
		
		Student satish=new Student("Ram", "I would like to watch the india vs Pakistan match because there is lot of drama is happening while the match");
		System.out.println(satish.name+" "+satish.behavior);
	}

}
