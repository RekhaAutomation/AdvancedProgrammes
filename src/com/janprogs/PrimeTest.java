package com.janprogs;

public class PrimeTest {

	public static Boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num% i==0) {
				return false;
			}
		}
		
		return true;
					
	}
	public static void getPrime(int number) {
		for(int i=2;i<=number;i++) {
						if(isPrime(number)) {
				System.out.print(number);
			}
		}
		
	}
	public static void main(String[] args) {
		getPrime(20);
		System.out.println(isPrime(7));
		System.out.println(isPrime(9));
		

	}

}
