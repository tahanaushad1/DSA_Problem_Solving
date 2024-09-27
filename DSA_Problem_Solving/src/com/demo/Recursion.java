package com.demo;
//This the Number from 5 to 1 Using Recursion;
public class Recursion {
	public static void printNum(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNum(n-1);
		
	}
	
	public static void main(String[] args) {
		int n=10;
		printNum(n);
		
	}

}
