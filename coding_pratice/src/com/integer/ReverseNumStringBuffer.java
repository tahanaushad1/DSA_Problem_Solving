package com.integer;

import java.util.Scanner;

public class ReverseNumStringBuffer {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reversed Number is :"+rev);
	}

}
