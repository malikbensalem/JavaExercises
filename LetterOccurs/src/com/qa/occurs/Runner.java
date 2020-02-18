package com.qa.occurs;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String allLetterOccurs(String sen) {
		String a = "";
		for (int i=0; i < sen.length() ; i++) {
			if (sen.charAt(i) != ' ') {
				if (!a.contains(String.valueOf(sen.charAt(i)))) {
					a += String.valueOf(sen.charAt(i));
				}
			}
		}
		return a;
	}

}
