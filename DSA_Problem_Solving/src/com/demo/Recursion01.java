package com.demo;
//print the Number from 1 to 5;
public class Recursion01 {
	public static void print(int n) {
		if(n==6) {
			return;
		}
		System.out.println(n);
		print(n+1);
		
	}
	public static void main(String[] args) {
		int n=1;
		print(n);
	}

}
