package com.janprogs;

public class TryCatchTest {

	public static void main(String[] args) {
		print();
	}
		public static void print() {
		 try{
			 
			System.out.println("printing from try block");
			throw  new NullPointerException();
					}
	
			 finally {
		 
						System.out.println("printing from finally block");
					}
		
	
	
}

}