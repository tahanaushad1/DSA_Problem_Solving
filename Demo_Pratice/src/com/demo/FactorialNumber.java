package com.demo;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("The Factorial Number is:"+factorial);
	}

}
