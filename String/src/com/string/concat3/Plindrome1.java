package com.string.concat3;

public class Plindrome1 {
	public static void main(String[] args) {
		String name="Mam";
		
		int left=0;
		int right=name.length()-1;
		
		boolean isPlindrome=true;
		
		while(left<right) {
			if(name.charAt(left)!=name.charAt(right)) {
				isPlindrome=false;
				break;
			}
			left++;
			right--;
			
			
		}
		if(isPlindrome) {
			System.out.println("Is Plindrome");
		}else {
			System.out.println("Is not plindrome");
		}
	}

}
