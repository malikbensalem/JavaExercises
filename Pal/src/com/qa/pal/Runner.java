package com.qa.pal;

public class Runner {

	public static void main(String[] args) {
		System.out.println(pal("k kl"));
		System.out.println(pal(" k k"));
	}public static boolean pal(String sen) {
		String noSpace=sen.replaceAll(" ","").toLowerCase();
		return new StringBuilder(noSpace).reverse().toString().equals(noSpace);
	}

}
