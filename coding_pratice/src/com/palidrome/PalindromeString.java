package com.palidrome;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String str=sc.next();
	String org_str=str;
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	if(org_str.equals(rev)) {
		System.out.println("It is a Palindrome String: "+org_str);
	}else {
		System.out.println("It is not a plaindrome String "+org_str);
	}
	
	
	}
}
