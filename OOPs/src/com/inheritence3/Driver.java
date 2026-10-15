package com.inheritence3;

public class Driver {

	public static void main(String[] args) {
		
		ProductName pro = new ProductName("iphone","Hazaribagh",130000,"Suraj","This product is good but very expensive ");
		
		//pro.viewDetails();
		
		Electronics ee = new Electronics("iphone","Hazaribagh",130000,"Suraj","This product is good but very expensive ",true,2);
		
		//ee.viewElectronicsDetails();
		
		Clothing cloth = new Clothing("Wrogn","Barhi",1200,"Kamdev","This product is good and its fabric is very good","Red",42); {
			cloth.viewClothDetails();
			
		}

	}

}
