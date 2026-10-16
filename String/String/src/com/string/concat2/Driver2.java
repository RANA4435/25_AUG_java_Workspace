package com.string.concat2;

public class Driver2 {

	public static void main(String[] args) {
		//creating an object
        String s="Ranchi"+" Hazaribagh"+" Koderma";
        //only one object getting created
        System.out.println(s);
        
        
        String s1="Ranchi";//scp
        String s2=" Hazaribagh";//scp
        String s3=s1+s2;//heap
        String s7=" Wala";
        
        String s8=s1.concat(s7);
        System.out.println(s8);
        
        System.out.println(s3);
        
        String s4="Ranchi Hazaribagh";//scp
        
        System.out.println(s4==s3);
        
        System.out.println(s4==s3.intern());//using the intern we  are checking the object does exist in the scp or not
	}

}
