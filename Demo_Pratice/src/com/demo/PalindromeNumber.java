package com.demo;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int org_num=n;
		int reverse=0;
		while(n!=0) {
			reverse=reverse*10+n%10;
			n=n/10;
		}
		if(org_num == reverse) {
			System.out.println("This is a palindrome Number:"+org_num);
		}else {
			System.out.println("This is not a palindrome Number:"+org_num);
		}
		
				
	}

}
