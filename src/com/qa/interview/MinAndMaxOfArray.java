package com.qa.interview;

public class MinAndMaxOfArray {

	public static void main(String[] args) {
		int arr[]= {56,-78,234,987,-34};
		
		int smallest=arr[0];
		int largest=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
				else if(arr[i]>largest) {
					largest=arr[i];
			}
			
		}
		System.out.println("smallest is" +smallest);
		System.out.println("largest is "+ largest);
	}

}
