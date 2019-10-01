package com.qa.interview;

public class CapsFromString {

	public static void main(String[] args) {
		
		
		String input="Find Capital Letters From String";
		System.out.println();
		String isUp="";
		int length=input.length();
		System.out.println(input.replaceAll("[a-z]", ""));
		
		//second method
		for(int i=0; i< length; i++){
	         if(Character.isUpperCase(input.charAt(i))){
	            isUp=isUp+ input.charAt(i);
	         
	         }
	      }
	      System.out.println("The uppercase characters are " + isUp);
	      
	   }
	
	}


