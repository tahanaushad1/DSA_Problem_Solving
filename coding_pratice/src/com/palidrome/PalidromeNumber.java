package com.palidrome;

import java.util.Scanner;

public class PalidromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println("It is a palindrome no. "+org_num);
		}else {
			System.out.println("It is not a plindrome no. "+org_num);
			
		}
	}

}
