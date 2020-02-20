package com.qa.index;

public class Runner {

	public static void main(String[] args) {
		System.out.println(indexO('s',"fdsa"));
		System.out.println(indexO('a', "sdf"));

	}public static int indexO(char c,String sen) {
		int i=0;
		for (char l:sen.toCharArray()) {
			if (l==c) {
				return i;
			}i++;
		}return -1;
	}

}
