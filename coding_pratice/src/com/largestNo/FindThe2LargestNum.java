package com.largestNo;

import java.util.Scanner;

public class FindThe2LargestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter second Number");
		int num2=sc.nextInt();
		System.out.println("Enter Third Number");
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1+"is a largest number");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+"is a largest number");
		}else {
			System.out.println(num3+"is a lagest number");
		}
	

	}

}
