package com.interface1;

public interface IDiscount {
	
	public static final int MAX_INT=100;// it will always public static final if u will not write java will automitically take as it
	
	public abstract int doIDiscount(int amount, int rate);// abstract->idea or thought
	public abstract void iDiscountTax(int tax);

}
