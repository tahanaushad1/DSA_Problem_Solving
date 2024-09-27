package com.Swapping;

public class Swapping2Number {
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Before swapping :"+ a+" "+b);
		//using third variable//c=10,a=20,b=10
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping :"+a+" "+b);
	}

}
