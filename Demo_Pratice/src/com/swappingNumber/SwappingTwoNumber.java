package com.swappingNumber;


public class SwappingTwoNumber {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("After swapping number is "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("before swapping number is "+a+" "+b);
		
	}

}
