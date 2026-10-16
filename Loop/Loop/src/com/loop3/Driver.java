package com.loop3;


public class Driver {
//	String name;
//	String behavior;
//	int age ;
//	int marks;
//	int standard;
//	String subject;
//	String course;
	public static void main(String[] args) {
		Student pp[]=new Student[4];
		
		
		Student pp1=new Student("kamdev","Good guy",22,875,10,"maths","BCA");
		Student pp2=new Student("salman","Very Naughty guy",25,875,10,"Science","Btech");
		Student pp3=new Student("sandeep","Brilliant guy",32,875,10,"Chemistry","MCA");
		Student pp4=new Student("pawan","good at nature guy",72,875,10,"Biology","BBA");
		pp[0] = pp1;
        pp[1] = pp2;
        pp[2] = pp3;
        pp[3] = pp4;
		
		for(int i=0;i<pp.length;i++) {
			if(pp[i].age>20) {
				System.out.println("Age="+pp[i].age);
				System.out.println("Name="+pp[i].name);
			}
		}
    
	}

}
