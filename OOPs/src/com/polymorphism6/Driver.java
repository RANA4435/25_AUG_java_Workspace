package com.polymorphism6;
class Area{
	public void doArea(int a, int b) {
		System.out.println("Area....");
	}
}
class Square extends Area{
	public void doArea(int a) {
		System.out.println("Area of Square...."+(a*a));
	}
}
class Rectangle extends Area{
	@Override
	public void doArea(int a, int b) {
		System.out.println("Area of Rectangle...."+(a*b));
	}
}
class VolumeCuboid{
	public void doVolumeCuboid(int a,int b,int c) {
		System.out.println("Area of Cuboid....."+(a*b*c));
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area = new Area();
		area.doArea(0, 0);
		
		Area area1 = new Rectangle();
		area1.doArea(7, 9);
		
		Square square = new Square();
		square.doArea(3);

	}

}
