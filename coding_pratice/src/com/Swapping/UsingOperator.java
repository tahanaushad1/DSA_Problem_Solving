package com.Swapping;

public class UsingOperator {
	public static void main(String[] args) {
	
		int a=90,b=20;
		System.out.println("before swaping number :"+a+" "+b);
		a=a+b;//90+20=110
		b=a-b;//110-20=90
		a=a-b;//110-90=20
		System.out.println("After swapping :"+a+" "+b);

	}
}
