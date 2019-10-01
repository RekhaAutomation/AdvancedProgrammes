package com.qa.interview;

public class RevInteger {

	public static void main(String[] args) {
		
		int num=6789;
		
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
					
		}
		System.out.println(rev);
		// TODO Auto-generated method stub

	}

}
