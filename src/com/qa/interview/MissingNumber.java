package com.qa.interview;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {12,13,14,15,17,18,19,20};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);
int sum1=0;
for(int j=12;j<=20;j++) {
	sum1=sum1+j;
}
System.out.println(sum1);
System.out.println(sum1-sum);
	}

}
