package com.interface1;

interface ICala{

void sum();

}

public class Calc implements ICala{
	public void sum()
		{
		System.out.println(3*3);
		}

	public static void main(String[] args)
	{


	Calc c = new Calc();
	c.sum();

	}

}

