package com.prime;

import java.util.Scanner;

public class FindPrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int num=sc.nextInt();
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("It not a prime number");
				return;
			}
			
		}
		
			System.out.println("Its a prime number");
		
		
		
	}

}
