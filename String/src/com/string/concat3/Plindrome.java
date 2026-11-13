package com.string.concat3;

public class Plindrome {
	public static void main(String[] args) {
		String str="madam";
		
		int left=0;
		int right=str.length()-1;
		
		boolean isPlindrome=true;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				isPlindrome=false;
				break;
			}
			left++;
			right--;
		}
		if(isPlindrome) {
			System.out.println("is Plindrome");
		}else {
			System.out.println("Is not Plindrome");
		}
	}

}
