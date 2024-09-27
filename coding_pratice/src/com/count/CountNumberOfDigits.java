package com.count;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		int num=12345;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Total count is: "+count);
	}

}
