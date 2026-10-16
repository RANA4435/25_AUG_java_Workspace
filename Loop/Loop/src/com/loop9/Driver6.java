package com.loop9;

public class Driver6 {

	public static void main(String[] args) {
		int numbers[] = { 12, 45, 23, 12, 67, 34, 89, 45, 56, 23, 78, 12, 90, 34, 45, 67, 11, 56, 23, 89 };
          int highest =0;
          int second =0;
          
          for(int i=0;i<numbers.length;i++) {
        	  if(numbers[i]>highest) {
        		  second=highest;
        		  highest=numbers[i];
        	  }
          }
          System.out.println("There are="+highest);
          System.out.println(second);
      
	}

}
