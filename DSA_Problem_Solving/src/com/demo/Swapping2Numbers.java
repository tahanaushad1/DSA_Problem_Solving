package com.demo;

import java.util.Scanner;

public class Swapping2Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1=sc.nextInt();
		System.out.println("Enter 2st Number");
		int num2=sc.nextInt();
		System.out.println("Before Swapping Number is "+num1+" "+num2);

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping Number is "+num1+" "+num2);
		
	}

}
