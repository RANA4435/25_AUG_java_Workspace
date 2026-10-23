package com.polymorphism.compile.time;
//  method overriding is done at the run-time
class Area {
	public void doArea(int a, int b) {
		System.out.println("Area ....");
	}
}
class Square  {
	//method Overloading is done at the time compile-time

	public void doArea(int a,int b) {
		System.out.println("Square ...."+(a*a));
	}
	public void doVolume(int a, int b,int c) {
		System.out.println("Area of Cuboid.. "+(a*b*c));
	}
}
class Rectangle extends Area {
	@Override
	public void doArea(int a, int b) {
		System.out.println("Rectangle ...."+(a*b));
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area = new Area();
		area.doArea(0, 0);
		
		Square square = new Square();
		square.doArea(6, 8);
		square.doVolume(6, 8, 9);
		
		Area area1 = new Rectangle();
		area1.doArea(2, 7);

	}

}
