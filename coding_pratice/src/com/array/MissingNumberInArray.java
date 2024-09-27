package com.array;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7,8};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements in arrays:"+sum1);
		int sum2=0;
		for(int i=0;i<=8;i++) {
			sum2=sum2+i;
		}
		System.out.println("sum of rang in a arrays:"+sum2);
		System.out.println("Missing Number is: "+(sum2-sum1));
	}

}
