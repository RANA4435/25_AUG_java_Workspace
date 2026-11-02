package com.interface8;

@FunctionalInterface
public interface IAccountMgmt extends IAccount 
{
    void accountMgmt();// it should have only one abstract method 
	//but it have two one from the IAccount and one method from the IAccountMgmt so it become two 
	default void addBenni() {
		
	}

}
