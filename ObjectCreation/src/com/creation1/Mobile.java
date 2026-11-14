
	package com.creation1;

	public class Mobile {

	    String brand;
	    int price;
	    int ram;

	    public Mobile(String brand, int price, int ram) {
	        this.brand = brand;
	        this.price = price;
	        this.ram = ram;
	    }

	    // Method to compare two mobile prices
	    public void comparePrice(Mobile mob1, Mobile mob2) {

	        if (mob1.price > mob2.price) {
	            System.out.println(mob1.brand + " is more expensive");
	        }
	        else if (mob1.price < mob2.price) {
	            System.out.println(mob2.brand + " is more expensive");
	        }
	        else {
	            System.out.println("Both mobiles have the same price");
	        }
	    }

	    public static void main(String[] args) {

	        Mobile mob = new Mobile("Vivo", 100000, 512);
	        Mobile mob1 = new Mobile("Samsung", 60000, 256);

	        mob.comparePrice(mob, mob1);
	    }
	}