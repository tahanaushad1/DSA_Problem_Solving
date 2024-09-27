package com.evenodd;

import java.util.Scanner;

public class CheckEvenOdd {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number");
	int num=sc.nextInt();
	if(num%2==0) {
		System.out.println("even number");
		
	}else {
		System.out.println("odd number");
	}
		

}
}
