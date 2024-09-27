package com.GenerateRandomNum;

import java.util.Random;

public class GenerateRandomNumAndString {
	public static void main(String[] args) {
		Random ran=new Random();
		int i = ran.nextInt(100);
		System.out.println("This is a random number:"+i);
		
		
	}

}
