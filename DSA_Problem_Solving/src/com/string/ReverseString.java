package com.string;

public class ReverseString {
	public static void main(String[] args) {
		String original="Taha";
		String reverse=new StringBuilder(original).reverse().toString();
		System.out.println("Reverse :"+ reverse);
	}

}

