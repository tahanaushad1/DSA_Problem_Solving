package com.String;

public class UsingLoop {
	public static void main(String[] args) {
		String s="java is a programming language";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
			
		}
		System.out.println("Reverse: "+reverse);
	}

}
