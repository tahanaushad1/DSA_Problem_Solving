package com.demo;

import java.util.Scanner;

public class ReversString {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String s1=sc.nextLine();
	String sb=new StringBuilder(s1).reverse().toString();
	System.out.println("Reverse is: "+ sb);

	}
	

}
