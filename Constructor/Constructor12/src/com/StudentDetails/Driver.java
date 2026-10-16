package com.StudentDetails;
public class Driver {
	static int gst=18;
	
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Driver(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName)
	{
		this.amount=_amount;
		this.itemName=_itemName;
		this.billingAddress=_billingAddress;
		this.customerId=_customerId;
		this.customerName=_customerName;
	}
	
}
 class Invoice{
	public static void main(String args[]) {
		Driver kk=new Driver(14562,"phone","BTM","C4653","chikku");
		Driver kk1=new Driver(522,"gadget","BTM", "g5474","Ram");
		
		System.out.println(kk.amount+" "+kk.itemName+" "+kk.billingAddress+" "+kk.customerId+" "+kk.customerName+kk.gst);
		System.out.println(kk1.amount+" "+kk1.itemName+" "+kk1.billingAddress+" "+kk1.customerId+" "+kk1.customerName);
		
	}
}
	