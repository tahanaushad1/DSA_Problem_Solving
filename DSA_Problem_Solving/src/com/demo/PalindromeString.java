package com.demo;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		String org_str=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println("This is a Palindrome String: "+org_str);
		}else {
			System.out.println("This is not a palindrome String "+org_str);
		}
	
		
	}

}
