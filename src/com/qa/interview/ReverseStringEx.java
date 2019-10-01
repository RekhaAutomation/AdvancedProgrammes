package com.qa.interview;

public class ReverseStringEx {
	
	public static void main(String[] args) {
		String str="Selenium";
		int len=str.length();
		String rev="";
		System.out.println("length of the string is" +len);
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
System.out.println(rev);

StringBuffer sbf=new StringBuffer(str);
System.out.println(sbf.reverse());
	}

}
