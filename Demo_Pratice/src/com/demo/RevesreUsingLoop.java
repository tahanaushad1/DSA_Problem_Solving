package com.demo;

import java.util.Scanner;

public class RevesreUsingLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine();
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--) {
			reverse+=s1.charAt(i);
		}
		System.out.println("Reverse: "+reverse);
		
	}

}