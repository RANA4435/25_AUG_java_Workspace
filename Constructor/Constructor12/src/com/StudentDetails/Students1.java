package com.StudentDetails;

public class Students1 {
	public void studentService(String _type) {
		System.out.println("Student");
		
		if(_type.equalsIgnoreCase("mark")) {
			sendMark();
		} else if(_type.equalsIgnoreCase("attendence")) {
			sendAttendence();
		}else if(_type.equalsIgnoreCase("fees")) {
			sendFees();
		}else if(_type.equalsIgnoreCase("result")) {
			sendResult();
		} else {
			System.out.println("hhh");
		}
	}private void sendMark() {
		System.out.println("Student.sendMarks() START");
		//
		System.out.println("Student.sendMarks() END");
	}private void sendAttendence() {
		System.out.println("Student.sendAttendence() START");
		//
		System.out.println("Student.sendAttendence() END");
	}private void sendFees() {
		System.out.println("Student.sendFees() START");
		//
		System.out.println("Student.sendFees() END");
	}private void sendResult() {
		System.out.println("Student.sendResult() START");
		//
		System.out.println("Student.sendResult() END");
	}
	

}
