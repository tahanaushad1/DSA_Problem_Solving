package com.array;

import java.util.Arrays;

public class CheckArraysEqual {
	public static void main(String[] args) {
		int a1[]= {1,2,3,4,4};
		int a2[]= {1,2,3,4,5};
		boolean b = Arrays.equals(a1, a2);
		if(b==true) {
			System.out.println("Arrays are Equals");
		}else {
			System.out.println("Arrays are not equals");
		}
	}

}
