package com.String;

public class Reverse_String {
	public static void main(String[] args) {
		String original="Taha";
		String reversed=new StringBuilder(original).reverse().toString();
		System.out.println("Reversed: " +reversed);
	}
}