package com.integer;

import java.util.Scanner;

public class ReverseIntegerNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Number");
	    int num=sc.nextInt();
	    int rev=0;
	    while(num!=0) {
	    	rev=rev*10+num%10;//0*10=0+1234%10=4
	    	num=num/10;
	    }
	    System.out.println("Reversed Number is: "+rev);
	    
	

	}

}
