package com.qa.find;

public class Runner {

	public static void main(String[] args) {
		System.out.println(find("hello",3,'s'));
		System.out.println(find("bye",3,'e'));
	}
	public static boolean find(String s,int i,char c) {
		return s.charAt(i-1)==c;
		
	}
}
