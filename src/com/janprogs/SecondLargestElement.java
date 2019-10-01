package com.janprogs;



public class SecondLargestElement {
	static int numbers[] = { 1, 3, 5, 6, 4, 7, 34, 10, 5, 0, -2, 11 };
	static int len=numbers.length;
	
	/*public static int seclargest(int numbers[],int len) {
		Arrays.sort(numbers);
		return numbers[len-2];
	}
*/
	public static void main(String[] args) {

		//seclargest(numbers,len);
		
		 

		int largest = numbers[0];
		int secondLargest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];

			} else if (numbers[i] > secondLargest) {
				secondLargest = numbers[i];

			}
		}

		System.out.println("Second largest number is:" + secondLargest);

	}

}
