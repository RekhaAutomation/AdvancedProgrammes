package com.janprogs;

public class ArrayMax {
	
		public static void main(String[] args) {
			int numbers[]= {900,23,56,34,76,-45,89,100,-99};
			int max=numbers[0];
			for(int i=0;i<numbers.length;i++) {
				if(numbers[i]>max) {
					max=numbers[i];
				}
				
			}
	System.out.println("maximum number of array is "+max);
	}

}
