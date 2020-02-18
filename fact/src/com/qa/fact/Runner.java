package com.qa.fact;

public class Runner {

	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(fact(6));

	}
	public static int fact(int i) {
		int count =1;
		for (;i>1;i--) {
			count*=i;
		}
		return count;
	}

}
