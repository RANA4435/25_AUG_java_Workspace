package com.interface8;

@FunctionalInterface// without this annotation it will work but when you write another method it will not give you any error
public interface IAccount

{
          String  account(String name,String address,int amt);// having only one abstract method -->SAM so it will treated as a functional interface
 
// default void addBeni() 
//{
//	System.out.println("Hii ");
//	
//}
// private void calculateBeni() {
//	 System.out.println("HII Everyone");
// }
// 
}
