package com.lamda;

public class LamdaExpression {
	public static void main(String[] args) {
//	MyInter i=()->{
//		System.out.println("Good moring");
//	};
//	i.getMsg();
	SumInter sumInter=(a,b)->a+b;
	System.out.println(sumInter.add(2, 8));
	System.out.println(sumInter.add(20,70));
	}
	

}
